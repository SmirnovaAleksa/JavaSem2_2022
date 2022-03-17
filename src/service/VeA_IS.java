package service;

import models.Course;
import models.Grade;
import models.ProfDegree;
import models.Professor;
import models.Student;

public class VeA_IS {
	
	public static void main(String[] args) {
		
		Professor prof1 = new Professor("Jānis", "Šate", ProfDegree.doctor);
		Professor prof2 = new Professor("Artūrs", "Orbidāns", ProfDegree.master);
		Professor prof3 = new Professor("Vairis", "Caune", ProfDegree.doctor);
		
		System.out.println(prof1);
		System.out.println(prof2);
		System.out.println(prof3);
		
		Course c1 = new Course("Elektronikas inženierijas pētniecības projekts", (byte)2, prof1);
		Course c2 = new Course("Iegultās operētājsistēmas", (byte)4, prof2);
		Course c3 = new Course("Automatizēto vadības sistēmu projektēšana", (byte)3, prof1);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		Student student1 = new Student("Jānis", "Bērziņš");
		Student student2 = new Student("Līga", "Jaukā");
		Student student3 = new Student("Dace", "Ozoliņa");
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		Grade g1 = new Grade(10,student1,c1);
		Grade g2 = new Grade(5,student1,c2);
		Grade g3 = new Grade(6,student1,c3);
		//Grade g4 = new Grade(7,student2,c1);
		//Grade g5 = new Grade(8,student2,c3);
		//Grade g6 = new Grade(10,student3,c2);
		//Grade g7 = new Grade(9,student3,c3);
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
	}
}
