package models;

public class Professor extends Person {
	//1. mainīgie
	private int id;
	
	private ProfDegree degree;
	
	
	private static int idCounter = 0;
	
	//2. get funkcijas
	public ProfDegree getDegree() {
		return degree;
	}
	public int getId() {
		return id;
	}
	
	//3. set funkcijas
	public void setDegree(ProfDegree degree) {
		if(degree!=null) {
			this.degree = degree;
		}
		else {
			this.degree = ProfDegree.master;
		}
	}
	public void setId() {
		this.id = idCounter;
		idCounter++;
	}
	
	//3. konstruktori
	public Professor() {
		super("Test","Person");
		setId();
		setDegree(ProfDegree.doctor);
	}
	//Professor prof1 = new Professor("Karina","Sķinrtmane",ProfDegree.master)
	public Professor(String name,String surname,ProfDegree degree) {
		super(name,surname);
		setId();
		setDegree(degree);
	}
	
	//4. toString
	@Override
	public String toString() {
		return id + super.toString() + degree;
	}
	
	/*
	
	public String toString() {
		return name+ " " + surname + " " + degree;
	}
	*/
	
	
}
