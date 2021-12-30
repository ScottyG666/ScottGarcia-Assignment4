package main.StudentSorting.Utilities;

import java.io.IOException;
import java.util.ArrayList;

import main.StudentSorting.Student.Student;

public class Course1 extends AbstractCourse {
	
	public Course1 (String path, String nameOfClass) throws IOException {
		super(path,nameOfClass);
	}
		
	public ArrayList<Student> getArrayOftudentsForInstantiatedCourse() {
		return arrayOfStudentsForInstantiatedCourse;
	}
	

}
