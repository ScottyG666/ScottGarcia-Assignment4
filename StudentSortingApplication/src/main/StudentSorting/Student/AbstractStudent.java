package main.StudentSorting.Student;

public abstract class AbstractStudent{
	protected String studentID;
	protected String studentName;
	protected String studentClass;
	protected String studentGrade;
	protected String studentCSV;
	

	public String getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public Integer getStudentGradeInteger() {
		return (Integer) Integer.parseInt(studentGrade);
	}
	

	public String getStudentGradeString() {
		return studentGrade;
	}


	public String getStudentCSV() {
		return studentCSV;
	}
	

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}



	public void setStudentGradeString(String studentGradeString) {
		this.studentGrade = studentGradeString;
	}

	public void setStudentCSV(String path, String studentCSV) {
		this.studentCSV = studentCSV;
	}

}
