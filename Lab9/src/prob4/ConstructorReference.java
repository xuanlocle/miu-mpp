package prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isMale() {
		return this.gender.equals("Male");
	}

	public boolean isFemale() {
		return this.gender.equals("Female");
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

@FunctionalInterface
interface HumanCreator<A, B, R> {
	R create(A name, B age, A gender);
}

public class ConstructorReference {

	public static void main(String args[]){
		Human[] list = {
			new Human("Joe",35,"Male"),
			new Human("Jane",45,"Female"),
			new Human("John",30,"Male")
		};

		// Query 1  : Print only Female candidates names
		Arrays.stream(list)
				.filter(Human::isFemale)
				.map(Human::getName)
				.forEach(System.out::println);

		/* Query 2 : Create an object for the Type of Human class by choosing suitable Interface for the three  constructors using ClassName::new.
					 Then print the object status */
		HumanCreator<String, Integer, Human> creator = Human::new;
		Human human = creator.create("Alice", 25, "Female");
		System.out.println(human);

		// Query 3 : Count the male candidates whose age is more than 30
		long count = Arrays.stream(list)
				.filter(Human::isMale)
				.filter(person -> person.getAge() > 30)
				.count();
		System.out.println("Number of males over 30: " + count);
   }
}
