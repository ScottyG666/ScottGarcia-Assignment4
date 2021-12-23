
public interface Sorting {
	public Student[] convertStudentCSVToArray(String path) throws FileNotFoundException, IOException ;
	
	public Student[][] organizeStudentArray(Student[] completeStudentList);
	
	public void convertingStudentArrayToFiles(Student[][] theArray) throws IOException;
}
