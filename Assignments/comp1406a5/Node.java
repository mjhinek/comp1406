package comp1406a5;

public class Node{
	protected Student student;
	protected Node   left;
	protected Node   right;
	
	public Node(Student s){ this(s, null, null);}
	public Node(Student s, Node left, Node right){
		this.student = s; this.left = left; this.right = right; 
	}
	public Student getStudent(){ return student; }
	public Node   getLeft(){ return left; }
	public Node   getRight(){ return right; }
	
	public void setStudent(Student student){ this.student = student; }
	public void setLeft(Node left){ this.left = left;}
	public void setRight(Node right){ this.right = right;}


	// prints out tree rooted at this node
	
	// Todd Davies StackOverflow https://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram/8948691#8948691
@Override
public String toString() {
    return this.toString(new StringBuilder(), true, new StringBuilder()).toString();
}

	
	 // Todd Davies StackOverflow https://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram/8948691#8948691
  public StringBuilder toString(StringBuilder prefix, boolean isTail, StringBuilder sb) {
    if(right!=null) {
        right.toString(new StringBuilder().append(prefix).append(isTail ? "\u2502   " : "    "), false, sb);
    }
    sb.append(prefix).append(isTail ? "\u2514\u2500\u2500 " : "\u250C\u2500\u2500 ").append(student.toString()).append("\n");
    if(left!=null) {
        left.toString(new StringBuilder().append(prefix).append(isTail ? "    " : "\u2502   "), true, sb);
    }
    return sb;
}

}
