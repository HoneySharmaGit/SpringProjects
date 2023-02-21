package bean;

public class Car {
	private String carname;
	private String carcolor;
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}
	public void getDetails() {
		System.out.println("Car Details:-");
		System.out.println("Car name is: "+carname);
		System.out.println("Car color is: "+carcolor);
	}
	
}
