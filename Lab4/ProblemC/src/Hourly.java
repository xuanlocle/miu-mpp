

public class Hourly extends Employee {
	private Double hourlyWage;
	private Integer hourPerWeek;
	
	Hourly(String empId, Double hourlyWage, Integer hourPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hourPerWeek = hourPerWeek;
	}

	@Override
	public Double calcGrossPay(Integer month, Integer year) {
		return this.hourlyWage * hourPerWeek * 4;
	}

}
