package models;

public class Professor {
	//1. mainīgie
	private String name;
	private String surname;
	private ProfDegree degree;
	//2. get funkcijas
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public ProfDegree getDegree() {
		return degree;
	}
	//3. set funkcijas
	public void setName(String name) {
		if(name.matches("[A-ZĀĒŪĪĻĶĢŠŽČŅ]{1}[a-zēūīāšģķļņčž]+")) {
			this.name = name;
		}
		else {
			this.name = "Unknown";
		}
	}
	public void setSurname(String surname) {
		if(name.matches("[A-ZĀĒŪĪĻĶĢŠŽČŅ]{1}[a-zēūīāšģķļņčž]+")) {
			this.surname = surname;
		}
		else {
			this.surname = "Unknown";
		}
	}
	public void setDegree(ProfDegree degree) {
		if(degree!=null) {
			this.degree = degree;
		}
		else {
			this.degree = ProfDegree.master;
		}
	}
	//3. konstruktori
	public Professor() {
		setName("Test");
		setSurname("Professor");
		setDegree(ProfDegree.doctor);
	}
	//Professor prof1 = new Professor("Karina","Sķinrtmane",ProfDegree.master)
	public Professor(String name,String surname,ProfDegree degree) {
		setName(name);
		setSurname(surname);
		setDegree(degree);
	}
	/*
	@Override
	public String toString() {
		return "Professor [name=" + name + ", surname=" + surname + ", degree=" + degree + "]";
	}
	*/
	
	
	
	//4. toString
	public String toString() {
		return name+ " " + surname + " " + degree;
	}
	
	
	
}
