package prob2A;

public class Main {

	public static void main(String []args) {
		Student s = new Student("Cuong");
		
		System.out.println(s.getName());
		
		GradeReport g = s.getGradeReport();
		g.setGrade("100");
		
		System.out.println(g.getGrade());
	}
}
