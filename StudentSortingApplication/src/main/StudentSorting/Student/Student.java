package main.StudentSorting.Student;

public class Student extends AbstractStudent{

	public Student(String studentInfo) {
		super(studentInfo);
	}
	

	public String getInfo() {
		return this.getStudentCSV();

	}
}

	
