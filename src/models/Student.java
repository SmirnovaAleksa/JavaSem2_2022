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
	public void setId(int id) {
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
	
	
}
