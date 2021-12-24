package main.StudentSorting.Application;

import java.io.*;

import main.StudentSorting.Student.Student;
import main.StudentSorting.Utilities.Sorting;

public class StudentSortingApplication {

	static String fileToBeRead = null;

	static Student[] students = new Student[100];

	// COMPSCI students
	static Student[] course1 = new Student[34];
	// STAT students
	static Student[] course2 = new Student[33];
	//APMTH students
	static Student[] course3 = new Student[33];
	
	static Student[][] arrayOfCourses = { course1, course2, course3 };

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Sorting sort = new Sorting();
		
		students = sort.convertStudentCSVToArray("MasterListFile.txt");
		
		arrayOfCourses = sort.organizeStudentArray(students);

		sort.convertingStudentArrayToFiles(arrayOfCourses);
	}
}
