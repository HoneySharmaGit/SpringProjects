package bean;

public class Car {
	private String carname;
	private String carcolor;
	private int carcount;
	private Engine e;

	public Car(Engine e) {
		super();
		this.e = e;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getCarcolor() {
		return carcolor;
	}

	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}

	public int getCarcount() {
		return carcount;
	}

	public void setCarcount(int carcount) {
		this.carcount = carcount;
	}

	public void getDetails() {
		System.out.println("Car Details are:-");
		System.out.println("Car name is: " + carname);
		System.out.println("Car color is: " + carcolor);
		System.out.println("Car count is: " + carcount);
		System.out.println("Car engine is: " + e.getCc());
	}
}
