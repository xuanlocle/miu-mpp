

public class Paycheck {

	private Double grossPay;
	private Double fica;
	private Double state;
	private Double local;
	private Double medicare;
	private Double socialSercurity;

	Paycheck(Double grossPay, Double fica, Double state, Double local, Double medicare, Double socialSercurity) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSercurity = socialSercurity;
	}
	
	public Double getNetPay() {
		return this.grossPay
				* (1 - this.fica - this.state - this.local - this.medicare - this.socialSercurity);
	}

	public void print() {
		System.out.println("  Gross Pay: " + this.grossPay);
		System.out.println("  Fica: " + this.fica);
		System.out.println("  State: " + this.state);
		System.out.println("  Local: " + this.local);
		System.out.println("  Medicare: " + this.medicare);
		System.out.println("  Social Sercurity: " + this.socialSercurity);
		System.out.println("  NET PAY: " + this.getNetPay());
	}

}
