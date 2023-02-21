package bean;

public class Car {
	private String carname;
	private String carcolor;
	private int carcount;
	private Engine e;

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

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public void getDetails() {
		System.out.println("Car Details:-");
		System.out.println("Car name is: " + carname);
		System.out.println("Car color is: " + carcolor);
		System.out.println("Car count is: " + carcount);
		System.out.println("Car Engine cc is: "+e.getCc());
	}
}
