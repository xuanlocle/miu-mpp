package prob2A;
public class Student {
	private String name;
	private GradeReport gradeReport;

	Student(String name) {
		this.name = name;
		this.gradeReport = new GradeReport(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	public GradeReport getGradeReport() {
		return this.gradeReport;
	}
}