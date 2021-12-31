package main.StudentSorting.Application;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

import main.StudentSorting.Student.Student;
import main.StudentSorting.Utilities.Course1;
import main.StudentSorting.Utilities.Course2;
import main.StudentSorting.Utilities.Course3;

public class StudentSortingApplication {

	static String fileToBeRead = "MasterListFile.txt";

	static Student[] students = new Student[100];

	// COMPSCI students
	static Course1 course1 = null;
	// STAT students
	static Course2 course2 = null;
	// APMTH students
	static Course3 course3 = null;

//	static Student[][] arrayOfCourses = { course1, course2, course3 };

	public static void main(String[] args) throws FileNotFoundException, IOException {
//
		course1 = new Course1(fileToBeRead,"COMPSCI");
		course1.sortStudents();
		course1.printStudents();
		course2 = new Course2(fileToBeRead, "STAT");
		course2.sortStudents();
//		course2.printStudents();
		course3 = new Course3(fileToBeRead, "APMTH");
		course3.sortStudents();
//		course3.printStudents();
	}
}
