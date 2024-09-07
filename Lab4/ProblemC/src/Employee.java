

public abstract class Employee {

	private String empId;
	
	Employee(String empId) {
		this.empId = empId;
	}
	
	public abstract Double calcGrossPay(Integer month, Integer year);
	
	public Paycheck calcCompensation(Integer month, Integer year) {
		Double grossPay = this.calcGrossPay(month, year);
		final Double fica = 0.23;
		final Double state = 0.05;
		final Double local = 0.01;
		final Double medicare = 0.03;
		final Double socialSercurity = 0.075;

		return new Paycheck(grossPay, fica, state, local, medicare, socialSercurity);
	}
	
	public void print(Integer month, Integer year) {
		Paycheck p = this.calcCompensation(month, year);
		System.out.println("Employee Id: " + this.empId);
		System.out.println("Paystub:");
		p.print();
	}
	
}
