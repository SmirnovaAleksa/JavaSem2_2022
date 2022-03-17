package models;

public class Person {
	//1. Mainīgie 
	private String name;
	private String surname;
	
	//2.1 Getters
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
	
	//2.2 Setters
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
		public Person() {
			setName("Test");
			setSurname("Person");
		}
		
		public Person(String name,String surname) {
			setName(name);
			setSurname(surname);
		}
		
		//4. toString
		@Override
		public String toString() {
			return " "+name +" "+ surname+ " ";
		}
}
