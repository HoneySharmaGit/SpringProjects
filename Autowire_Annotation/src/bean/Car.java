package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Car {
	@Value("Scorpio") // annotation for add values to the class variables directly.
	private String carname;
	@Value("black")
	private String carcolor;
	@Value("10")
	private int carcount;
	@Qualifier("e2") // annotation to add values from the specific object only.
	@Autowired // annotation to autowire the dependancies on it's own.
	private Engine e;

	public void getDetails() {
		System.out.println("Car Details are:");
		System.out.println("Car name is: " + carname);
		System.out.println("Car color is: " + carcolor);
		System.out.println("Car count is: " + carcount);
		System.out.println("Car engine is: " + e.getCc());
	}
}
