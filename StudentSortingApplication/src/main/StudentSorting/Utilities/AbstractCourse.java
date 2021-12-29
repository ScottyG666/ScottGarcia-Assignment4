package main.StudentSorting.Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import main.StudentSorting.Student.Student;

//import main.StudentSorting.Student.Student;

abstract class AbstractCourse {

	// this is the default size of the student array because the size of the
	// largest course should not contain more than 50
	public Student FirstLineOfFile;
	protected String nameOfClass;
	public ArrayList<Student> arrayOfStudentsForInstantiatedCourse = new ArrayList<Student>();

	static final Integer firstLineOfFileToDefineColumns = 0;
	static Integer firstLineOfFileForStudents = 1;

	public AbstractCourse(String path, String nameOfClass) throws IOException {
		this.nameOfClass = nameOfClass;

		try (BufferedReader reader = new BufferedReader(new FileReader(path));) {
			FirstLineOfFile = new Student(reader.readLine());
			String currentStudentIteratore;
			while ((currentStudentIteratore = reader.readLine()) != null) {

				Student tempStudent = new Student(currentStudentIteratore);
				if (tempStudent.getStudentClass().contains(nameOfClass)) {
					this.arrayOfStudentsForInstantiatedCourse.add(tempStudent);
				}
//				Collections.sort(this.arrayOfStudentsForInstantiatedCourse);
			}
		}

	}

	public void printStudents() {
		for (Student student : this.arrayOfStudentsForInstantiatedCourse) {
			System.out.println(student.getStudentCSV());

		}
	}
}

