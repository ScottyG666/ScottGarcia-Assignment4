package main.StudentSorting.Student;

public class Student implements Comparable<Student>{

	private String studentID;
	private String studentName;
	private String studentClass;
	private Integer studentGrade;
	private String studentCSV;
	
	public String getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public Integer getStudentGrade() {
		return studentGrade;
	}
	
	public String getStudentCSV() {
		return studentCSV;
	}


	public Student (String studentInfo) {
		this.studentCSV = studentInfo;
		String[] studentInfoDivided = studentInfo.split(",");
		
		this.studentID = studentInfoDivided[0] ;
		this.studentName = studentInfoDivided[1];
		this.studentClass = studentInfoDivided[2];
		this.studentGrade = Integer.parseInt(studentInfoDivided[3]);
		
	}
	
	public String getInfo() {
		return this.getStudentCSV();
		
	}

	@Override
	public int compareTo(Student that) {
		if (this.studentGrade > that.studentGrade) {
			return -1;
		} else if (this.studentGrade.equals(that.studentGrade)) {
			return 0 ;
		} else {
			return 1;
		}
	}
}
