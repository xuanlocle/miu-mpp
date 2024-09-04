package prob2B;

import java.time.LocalDate;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("Problem 2B");
		
		Order order = new Order("1000", LocalDate.now());
		order.addOrderLine(90001, 10.0, 1);
		order.addOrderLine(90002, 100.0, 10);
		
		List<OrderLine> orderLines = order.getOrderLines();
		System.out.print("Total amount in order: ");
		Double total = 0.0;
		for (OrderLine orderLine : orderLines) {
			total += orderLine.getTotal();
		}
		System.out.println(total);
	}
}
