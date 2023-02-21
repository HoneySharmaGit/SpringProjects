package bean;

public class Car {
	private String carname;
	private int carcount;
	private Engine e;

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public int getCarcount() {
		return carcount;
	}

	public void setCarcount(int carcount) {
		this.carcount = carcount;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public void getDetails() {
		System.out.println("Car Details are:-");
		System.out.println("Car name is: " + carname);
		System.out.println("Car count is: " + carcount);
		System.out.println("Car Engine CC is: " + e.getCc());
	}

}
