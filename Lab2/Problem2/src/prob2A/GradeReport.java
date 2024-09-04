package prob2A;

public class GradeReport {
	private String grade;
	private Student s;
	
	private GradeReport() {}

	GradeReport(Student s) {
		if (s == null) {
			throw new NullPointerException("Student can not be null");
		}
		this.s = s;
	}
	
	public Student getStudent() {
		return this.s;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getGrade() {
		return this.grade;
	}
}
