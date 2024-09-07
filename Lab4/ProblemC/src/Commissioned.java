
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
		for (Order o : soldOrders) {
			if (o.getOrderDate().plusMonths(1).getMonthValue() == month
					&& o.getOrderDate().plusMonths(1).getYear() == year) {
				totalSoldOrdersValue += o.getOrderAmount();
			}
		}
		return totalSoldOrdersValue * this.commission + this.baseSalary;
	}

}
