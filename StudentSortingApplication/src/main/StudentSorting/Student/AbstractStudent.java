package main.StudentSorting.Student;

public abstract class AbstractStudent{
	protected String studentID;
	protected String studentName;
	protected String studentClass;
	protected String studentGrade;
	protected String studentCSV;
	protected Integer studentGradeInteger;
	
	public AbstractStudent(String studentInfo) {
		this.studentCSV = studentInfo;
		String[] studentInfoDivided = studentInfo.split(",");

		this.setStudentID(studentInfoDivided[0]);
		this.setStudentName(studentInfoDivided[1]);
		this.setStudentClass(studentInfoDivided[2]);
		this.setStudentGrade(studentInfoDivided[3]);

	}
	

	

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
		return (Integer) Integer.parseInt(this.studentGrade);
	}
	

	public String getStudentGrade() {
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



	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	public void setStudentCSV(String studentCSV) {
		this.studentCSV = studentCSV;
	}
	

}

