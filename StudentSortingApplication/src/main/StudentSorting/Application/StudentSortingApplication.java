package main.StudentSorting.Application;

import java.io.*;

import main.StudentSorting.Sorting.Sorting;
import main.StudentSorting.Student.Student;

public class StudentSortingApplication {

	public static final Integer filesFirstLine = 0;
	public static final Integer firstStudentLine = 0;
	public static Integer course1Index = 1;
	public static Integer course2Index = 1;
	public static Integer course3Index = 1;
	public static String firstLine ;
	static String fileToBeRead = null;
	
	
	static Student[] students = new Student[100];
	
	static String[][] arrayOfStudents = new String[100][5];
	//this is the Array for COMPSCI students
	static Student[] course1 = new Student[34];
	//This is the Array for STAT students
	static Student[] course2 = new Student[33];
	//This is the Array for APMTH students
	static Student[] course3 = new Student[33];
	static Student[][] arrayOfCourses = {course1,course2,course3};


	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Sorting sort = new Sorting();
		fileToBeRead = "MasterListFile.txt";
		
		students = sort.convertStudentCSVToArray(fileToBeRead);

		arrayOfCourses = sort.organizeStudentArray(students);
		
		for (Student[] course : arrayOfCourses) {
			for (Student student : course) {
				System.out.println(student.getInfo());
			}
		}
		
		
		
//		
//			try(BufferedWriter writer1 = new BufferedWriter(new FileWriter("course1.txt"));
//					BufferedWriter writer2 = new BufferedWriter(new FileWriter("course2.txt"));
//					BufferedWriter writer3 = new BufferedWriter(new FileWriter("course3.txt"))) {
//				writer1.write(firstLine);
//				writer2.write(firstLine);
//				writer3.write(firstLine);
//			Integer i = 0;
//			for (Student student : students) {
//				student.getInfo();
//	
//				arrayOfStudents[i][0] = student.getStudentID();
//				arrayOfStudents[i][1] = student.getStudentName();
//				arrayOfStudents[i][2] = student.getStudentClass();
//				arrayOfStudents[i][3] = student.getStudentGrade();
//				i++;
//				
//			}
//			
//			for (String[] student : arrayOfStudents) {
//				String studentCSV = "";
//				if (student[2].contains("COMPSCI")) {
//					studentCSV = student[0] + "," + student[1] + "," + student[2] + "," + student[3];
//					course1[course1Index] = studentCSV;
//					course1Index++;
//					
//				} else if (student[2].contains("STAT")) {
//					studentCSV = student[0] + "," + student[1] + "," + student[2] + "," + student[3];
//					course2[course2Index] = studentCSV;
//					course2Index++;
//				} else if (student[2].contains("APMTH")) {
//					studentCSV = student[0] + "," + student[1] + "," + student[2] + "," + student[3];
//					course3[course3Index] = studentCSV;
//					course3Index++;
//				}
//				
//			}
//			
			
//		}
//			
		
	}
}
