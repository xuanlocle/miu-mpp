package lab3.prob1;

public class PersonWithJob {
	private Person person;
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public Person getPerson() {
		return person;
	}

	PersonWithJob(String n, double s) {
		salary = s;
		this.person = new Person(n);
	}

	@Override
	public boolean equals(Object aPersonWithJob) {
		if(aPersonWithJob == null) return false;
		if(!(aPersonWithJob instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob) aPersonWithJob;
		return this.getPerson().getName().equals(p.getPerson().getName()) && this.getSalary() == p.getSalary();
	}

	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
		System.out.println("p1.equals(p2)? " + p1.getPerson().equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1.getPerson()));
	}

}
