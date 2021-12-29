package main.StudentSorting.Student;

public class Student extends AbstractStudent implements Comparable<Student> {

	public Student(String studentInfo) {
		this.studentCSV = studentInfo;
		String[] studentInfoDivided = studentInfo.split(",");

		this.setStudentID(studentInfoDivided[0]);
		this.setStudentName(studentInfoDivided[1]);
		this.setStudentClass(studentInfoDivided[2]);

	}

	public String getInfo() {
		return this.getStudentCSV();

	}

	@Override
	public int compareTo(Student that) {
		
		
		int compareGrade = that.getStudentGradeInteger();
		return compareGrade - this.getStudentGradeInteger();
	}

}
