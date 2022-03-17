package models;

public class Student extends Person{
	//1. Mainīgie 
	private int id;
	
	private static int idCounter = 10000;
	
	//2.1 Getters
	public int getId() {
		return id;
	}

	
	//2.2 Setters
	public void setId() {
		this.id = idCounter;
		idCounter++;
	}
	
	//3.Konstructori
	public Student() {
		super("Test","Student");
		setId();
	}
	
	public Student(String name,String surname) {
		super(name,surname);
		setId();
	}

	//4. toString
	@Override
	public String toString() {
		return id + super.toString();
	}
	
}
