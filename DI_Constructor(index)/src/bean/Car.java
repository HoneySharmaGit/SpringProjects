package bean;

public class Car {
	private String carname;
	private String carcolor;

	public Car(String carname, String carcolor) {
		super();
		this.carname = carname;
		this.carcolor = carcolor;
	}

	public void getDetails() {
		System.out.println("Car Details are:-");
		System.out.println("Car name is: " + carname);
		System.out.println("Car color is: " + carcolor);
	}
}
