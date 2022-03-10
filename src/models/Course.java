package models;

public class Course {
	//1. Msinīgie
	
	private int id;
	private String title; 
	private byte creditPoints; //Max 20
	private Professor professor; // Vai not null
	
	private static int idCounter = 1000;
	
	//2.1 Getters
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public byte getCreditPoints() {
		return creditPoints;
	}
	public Professor getProfessor() {
		return professor;
	}
	
	//2.2 Setters
	public void setTitle(String title) {
		if(title!= null && title.matches("[A-ZĀĒŪĪĻĶĢŠŽČŅ]{1}[\\s a-zēūīāšģķļņčžA-ZĀĒŪĪĻĶĢŠŽČŅ]+\\s?+[0-9]?")) {
			this.title = title;
		}
		else {
			this.title = "Unknown";
		}
	}
	public void setCreditPoints(byte creditPoints) {
		if(creditPoints > 0 && creditPoints <= 20) {
			this.creditPoints = creditPoints;
		}
		else {
			this.creditPoints = 0;
		}
	}
	public void setProfessor(Professor professor) {
		if(professor!=null) {
			this.professor = professor;
		}
		else {
			this.professor = new Professor();
		}
	}
	public void setId(int id) {
		this.id = idCounter;
		idCounter++;
	}
	

	
	
	
}
