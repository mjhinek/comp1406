package comp1406t5;

public class Student{
	protected String name;
	protected int    id;
	protected double    average;
	
	public Student(String name, int id, double average){
		this.name = name;
		this.id = id;
		this.average = average;
		}
		
	public String getName(){ return name; }
	public int getID(){ return id; }	
	public double getAverage(){ return average;} 
	
	
	@Override
	public String toString(){
		return name + ":" + id + ":" + average;
	}
}