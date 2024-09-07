

import java.time.LocalDate;

public class Order {
	private String orderNo;
	private LocalDate orderDate;
	private Integer orderAmount;

	Order(String orderNo, LocalDate orderDate, Integer orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public LocalDate getOrderDate() {
		return this.orderDate;
	}

	public Integer getOrderAmount() {
		return this.orderAmount;
	}
}
