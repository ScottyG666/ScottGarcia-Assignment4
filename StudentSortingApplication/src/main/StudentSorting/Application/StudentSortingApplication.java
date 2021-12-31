package main.StudentSorting.Application;

import java.io.FileNotFoundException;
import java.io.IOException;

import main.StudentSorting.Student.Student;
import main.StudentSorting.Utilities.*;
public class StudentSortingApplication {

	static String fileToBeRead = "MasterListFile.txt";
	static String fileNameForSortedStudentList1 = "course1.txt";
	static String fileNameForSortedStudentList2 = "course2.txt";
	static String fileNameForSortedStudentList3 = "course3.txt";

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
		course1 = new Course1(fileToBeRead, "COMPSCI");
		course1.writeStudentListToSpecifiedFile(fileNameForSortedStudentList1);
		course2 = new Course2(fileToBeRead, "STAT");
		course2.writeStudentListToSpecifiedFile(fileNameForSortedStudentList2);
		course3 = new Course3(fileToBeRead, "APMTH");
		course3.writeStudentListToSpecifiedFile(fileNameForSortedStudentList3);

	}
}
