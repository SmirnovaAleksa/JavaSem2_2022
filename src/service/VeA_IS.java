package service;

import models.Course;
import models.ProfDegree;
import models.Professor;

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
	}
}
