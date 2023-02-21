package bean;

public class Car {
	private String carname;
	private int carcount;

	public Car(String carname, int carcount) {
		super();
		this.carname = carname;
		this.carcount = carcount;
	}

	public void getDetails() {
		System.out.println("Car Details are:-");
		System.out.println("Car name is: " + carname);
		System.out.println("Car count is: " + carcount);
	}
}
