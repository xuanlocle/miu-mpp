

public class Salaried extends Employee {
	private Integer salary;
	
	Salaried(String empId, Integer salary) {
		super(empId);
		this.salary = salary;
	}

	@Override
	public Double calcGrossPay(Integer month, Integer year) {
		return (double) this.salary;
	}
}
