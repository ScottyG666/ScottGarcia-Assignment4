package main.StudentSorting.Application;

import java.io.*;

import main.StudentSorting.Student.Student;
import main.StudentSorting.Utilities.Sorting;

public class StudentSortingApplication {

	static String fileToBeRead = null;

	static Student[] students = new Student[100];

	// this is the Array for COMPSCI students
	static Student[] course1 = new Student[34];
	// This is the Array for STAT students
	static Student[] course2 = new Student[33];
	// This is the Array for APMTH students
	static Student[] course3 = new Student[33];
	// since we already know the size of the student arrays i am hard-coding the
	// size.
	static Student[][] arrayOfCourses = { course1, course2, course3 };

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Sorting class does the background work for storing information from the file
		// and distributing it
		// where its necessary for this particular instantiation of Sorting.
		Sorting sort = new Sorting();
		// The individual students are being stored into an array of Student Objects.
		// Student is a class created
		// to store granular information for each student for comparison.
		students = sort.convertStudentCSVToArray("MasterListFile.txt");
		// this method splits the existing array of students into separate Arrays
		// depending on their class
		// which are held inside an array of Student arrays called arrayOfCourses
		arrayOfCourses = sort.organizeStudentArray(students);

		// This is the final step, in which each individual array is written into their
		// own perspective text
		// files
		sort.convertingStudentArrayToFiles(arrayOfCourses);
	}
}
