package lab3.prob3;

public class Driver {

	public static void main(String[] args) {
		Address[] addresses = {
				new Address("111 Main", "Fairfield", "IA", "52556"),
				new Address("200 Forest Ave", "Fairfield", "IA", "52556"),
			    new Address("10 N. 4th St.", "Fairfield", "IA", "52556")
		};
		Property[] objects = {
				new House(addresses[0], 1200.0), // $120
				new Condo(addresses[1], 2), // $800
				new Trailer(addresses[2])  // $500
		};
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}
}
