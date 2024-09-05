package lab3.prob3;


public class House extends Property {
	private double lotSize;

	public House(Address address, double lotSize) {
		this.setAddress(address);
		this.lotSize = lotSize;
	}

	@Override
	public double computeRent(){
		return 0.1 * lotSize;
	}
}
