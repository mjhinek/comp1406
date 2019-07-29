package comp1406t4;


public class LList implements Comparable<LList>{
	protected Node head;
	protected Node tail;
	protected int  size;
	
	/* constructors */
	public LList(){
		head = tail = null;
		size = 0;
	}
	public LList(Node n){
		head = tail = n;
		size = 1;
	}

	/* simple getters */
	public int getSize(){ 
		return size; 
	}
	
	public String get(int position){
		// returns data of element at index position
		// returns null otherwise
		if( position < 0 || position > size -1 || head == null){
			return null;
		}
		int  count = 0;
		Node current = head;
		while(count < position){
			current = current.getNext();
			count += 1;
		}
		return current.getData();
	}
	
	
	/* setter */
	public boolean set(int position, String d){
		// set data of element at given position to d
		// returns true if successful and false otherwise
		return false;
	}
	
	/* add elements to the list */
	public LList addBack(String d){
		// add to back of list
		Node n = new Node(d);
		if( size == 0 ){
			head = tail = n;
		}else{
			tail.setNext(n);
			tail = n;
		}
		size += 1;
		return this;
	}
	
	public LList addFront(String d){
		// add to front of list
		Node n = new Node(d, head);
		head = n;
		if(size == 0){ tail = n; }
		size += 1;
		return this;
	}
	
	public LList add(int position, String d) throws OutOfBoundsException{
		// check if position is a valid index for adding in the list 
		// (0<=position<=length of list)
		// if it is NOT valid throw an exception 
		if( position < 0 ){
			throw new OutOfBoundsException("Cannot add a list item with negative index.");
	  }else if( position > size){
			throw new OutOfBoundsException("Cannot add an element with index " + position + "into a list of size " + size);
		}
		
		// special cases? 
		if( position == 0){
			return addFront(d);
		}else if( position == size ){
			return addBack(d);
		}
		
		// general case : find node at index position-1
		Node prev = head;
		int count = 0;
		while( count < position-1 ){
			count += 1;
			prev = prev.getNext();
		} // prev will point to node before 
		Node n = new Node(d, prev.getNext() );
		prev.setNext(n);
		size += 1;
		return this;
	}
	
	/* remove elements from the list */
	public String removeFront(){
		// remove x_0 (return data of x_0)
		return null;
	}
	
	public String remove(int position){
		// remove x_position (return data of x_position)
		return null;
	}	
	
	/* find element in list */
	public int find(String d){
		// return the first index k such that x_k == d
		// return -1 if d is not in the list
		return -2;
	}
	
	@Override
	public int compareTo(LList o){
		return 0;
	}

	
	
	@Override
	public String toString(){
		if( size == 0 || head == null){
			return null;
		}
		String out = "[";
		Node current = head;
		for(int i=0; i<size-1; i=i+1){
			out += current.getData() + "]->[";
			current = current.getNext();
		}
		return out+current.getData() +"]";
	}
}