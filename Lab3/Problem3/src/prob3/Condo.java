package lab3.prob3;


public class Condo extends Property {
	private int numberOfFloors;

	public Condo(Address address, int numberOfFloors) {
		this.setAddress(address);
		this.numberOfFloors = numberOfFloors;
	}

	@Override
	public double computeRent(){
		return 400 * numberOfFloors;
	}
}
