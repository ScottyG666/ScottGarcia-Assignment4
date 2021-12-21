package main.StudentSorting.Utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import main.StudentSorting.Student.Student;

public class Sorting {
	static String firstLine;

	public static final Integer firstStudentLine = 0;
	public static Integer course1Index = 0;
	public static Integer course2Index = 0;
	public static Integer course3Index = 0;

	static Student[] students = new Student[100];
	// this is the Array for COMPSCI students
	static Student[] course1 = new Student[34];
	// This is the Array for STAT students
	static Student[] course2 = new Student[33];
	// This is the Array for APMTH students
	static Student[] course3 = new Student[33];
	Student[][] arrayOfCourses = { course1, course2, course3 };

	// this method takes a String from the application and uses it as the file path
	// for the list of Students
	public Student[] convertStudentCSVToArray(String path) throws FileNotFoundException, IOException {

		try (BufferedReader reader = new BufferedReader(new FileReader(path));) {
			Integer i = firstStudentLine;
			firstLine = reader.readLine();
			String studentCSV = firstLine;
			while ((studentCSV = reader.readLine()) != null) {
				Student student = new Student(studentCSV);
				students[i] = student;
				i++;
			}
			return students;
		}
	}

	public Student[][] organizeStudentArray(Student[] completeStudentList) {
		for (Student student : completeStudentList) {
			if (student.getStudentClass().contains("COMPSCI")) {
				course1[course1Index] = student;
				course1Index++;
			} else if (student.getStudentClass().contains("STAT")) {
				course2[course2Index] = student;
				course2Index++;
			} else if (student.getStudentClass().contains("APMTH")) {
				course3[course3Index] = student;
				course3Index++;
			}

		}
		Arrays.sort(course1);
		Arrays.sort(course2);
		Arrays.sort(course3);
		Student[][] returnedArrayOfArrays = { course1, course2, course3 };
		return returnedArrayOfArrays;
	}

	public void convertingStudentArrayToFiles(Student[][] theArray) throws IOException {

		try (BufferedWriter writer1 = new BufferedWriter(new FileWriter("course1.txt"));
				BufferedWriter writer2 = new BufferedWriter(new FileWriter("course2.txt"));
				BufferedWriter writer3 = new BufferedWriter(new FileWriter("course3.txt"))) {

			writer1.write(firstLine + "\n");
			writer2.write(firstLine + "\n");
			writer3.write(firstLine + "\n");

			for (Student student : theArray[0]) {
				writer1.write(student.getInfo() + "\n");
			}
			for (Student student : theArray[1]) {
				writer2.write(student.getInfo() + "\n");
			}
			for (Student student : theArray[2]) {
				writer3.write(student.getInfo() + "\n");
			}

		}
	}

}
