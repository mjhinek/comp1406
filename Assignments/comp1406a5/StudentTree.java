package comp1406t5;


public class StudentTree{
	protected Node root;
	protected int  size;
	
	/* constructors */
	public StudentTree(){
		root = null;
		size = 0;
	}

	/* simple getter */
	public int getSize(){ 
		return size; 
	}
	
	
	/* finds a student with given name in this tree */
	public Student find(String name){
		return null;
	}
	
	/* finds a student with given ID in this tree */
	public Student find(int id){
		return null;
	}
	
	/* adds a student to the tree (as a leaf) */
	/* the new student should be added randomly as a leaf in the tree */
	public StudentTree add(Student student){
		return this;  // used for method chaining
	}
	
	
	
	
	
	
	
	
	
	
	
	/* DO NOT CHANGE THIS METHOD*/
	@Override
	public String toString() {
		return root == null? "" : root.toString();
	}


}  
