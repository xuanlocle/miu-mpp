package prob2B;

public class OrderLine {
	private Integer orderlinenum;
	private Double price;
	private Integer qty;
	private Order order;

	OrderLine(Integer orderlinenum, Double price, Integer qty, Order order) {
		this.orderlinenum = orderlinenum;
		this.price = price;
		this.qty = qty;
		this.order = order;
	}

	public Order getOrder() {
		return this.order;
	}
	
	public Integer getOrderLineNum() {
		return this.orderlinenum;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public Integer getQuantity() {
		return this.qty;
	}
	
	public Double getTotal() {
		return this.getPrice() * this.getQuantity();
	}
}
