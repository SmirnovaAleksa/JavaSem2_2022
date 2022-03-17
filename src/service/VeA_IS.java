package service;

import java.util.ArrayList;

import models.Course;
import models.Grade;
import models.ProfDegree;
import models.Professor;
import models.Student;

public class VeA_IS {
	
	private static ArrayList<Professor> allProfessors = new ArrayList<>();
	private static ArrayList<Student> allStudents = new ArrayList<>();
	private static ArrayList<Course> allCourses = new ArrayList<>();
	private static ArrayList<Grade> allGrades = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Professor prof1 = new Professor("Jānis", "Šate", ProfDegree.doctor);
		Professor prof2 = new Professor("Artūrs", "Orbidāns", ProfDegree.master);
		Professor prof3 = new Professor("Vairis", "Caune", ProfDegree.doctor);
		allProfessors.add(prof1);
		allProfessors.add(prof2);
		allProfessors.add(prof3);
		
		for(Professor temp: allProfessors) {
			System.out.println(temp);
		}
		
		//System.out.println(prof1);
		//System.out.println(prof2);
		//System.out.println(prof3);
		
		Course c1 = new Course("Elektronikas inženierijas pētniecības projekts", (byte)2, prof1);
		Course c2 = new Course("Iegultās operētājsistēmas", (byte)4, prof2);
		Course c3 = new Course("Automatizēto vadības sistēmu projektēšana", (byte)3, prof1);
		allCourses.add(c1);
		allCourses.add(c2);
		allCourses.add(c3);
		
		for(Course temp: allCourses) {
			System.out.println(temp);
		}
		
		//System.out.println(c1);
		//System.out.println(c2);
		//System.out.println(c3);
		
		Student student1 = new Student("Jānis", "Bērziņš");
		Student student2 = new Student("Līga", "Jaukā");
		Student student3 = new Student("Dace", "Ozoliņa");
		allStudents.add(student1);
		allStudents.add(student2);
		allStudents.add(student3);
		
		for(Student temp: allStudents) {
			System.out.println(temp);
		}
		
		//System.out.println(student1);
		//System.out.println(student2);
		//System.out.println(student3);
		
		Grade g1 = new Grade(10,student1,c1);
		Grade g2 = new Grade(5,student1,c2);
		Grade g3 = new Grade(6,student1,c3);
		allGrades.add(g1);
		allGrades.add(g2);
		allGrades.add(g3);
		//Grade g4 = new Grade(7,student2,c1);
		//Grade g5 = new Grade(8,student2,c3);
		//Grade g6 = new Grade(10,student3,c2);
		//Grade g7 = new Grade(9,student3,c3);
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
	}
}
