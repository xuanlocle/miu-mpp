

import java.util.List;

public class Commissioned extends Employee {

	private Double commission;
	private Integer baseSalary;
	private List<Order> soldOrders;

	Commissioned(String empId, Double commission, Integer baseSalary, List<Order> soldOrders) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.soldOrders = soldOrders;
	}

	@Override
	public Double calcGrossPay(Integer month, Integer year) {
		Double totalSoldOrdersValue = 0.0;
		Integer prevMonth = month == 1 ? 12 : month - 1;
		for (Order o : soldOrders) {
			if (o.getOrderDate().getMonthValue() == prevMonth && o.getOrderDate().getYear() == year) {
				totalSoldOrdersValue += o.getOrderAmount();
			}
		}
		return totalSoldOrdersValue * this.commission + this.baseSalary;
	}

}
