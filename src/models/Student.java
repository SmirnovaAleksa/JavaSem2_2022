package models;

public class Student {
	//1. Mainīgie 
	private int id;
	private String name;
	private String surname;
	
	private static int idCounter = 10000;
	
	//2.1 Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	//2.2 Setters
	public void setId() {
		this.id = idCounter;
		idCounter++;
	}

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
	
	//3.Konstructori
	public Student() {
		setId();
		setName("Test");
		setSurname("Student");
	}
	
	public Student(String name,String surname) {
		setId();
		setName(name);
		setSurname(surname);
	}

	//4. toString
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	
}
