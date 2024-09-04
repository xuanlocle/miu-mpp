package prob2B;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Order {
	private String ordernum;
	private LocalDate orderdate;
	private List<OrderLine> orderLines;
	
	Order(String ordernum, LocalDate orderDate) {
		this.ordernum = ordernum;
		this.orderdate = orderDate;
		this.orderLines = new ArrayList<OrderLine> ();
	}
	
	public void addOrderLine(OrderLine orderLine) {
		this.orderLines.add(orderLine);
	}
	
	public List<OrderLine> getOrderLines() {
		return this.orderLines;
	}
	
	public String getOrderNum() {
		return this.ordernum;
	}
	
	public LocalDate getOrderDate() {
		return this.orderdate;
	}
	
	public OrderLine addOrderLine(Integer orderlinenum, Double price, Integer quantity) {
		OrderLine orderLine = new OrderLine(orderlinenum, price, quantity, this);
		this.orderLines.add(orderLine);
		return orderLine;
	}
}
