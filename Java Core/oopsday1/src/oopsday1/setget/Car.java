package oopsday1.setget;

public class Car {
//	public Car() {
//		super();
//		this.color = color;
//		this.price = price;
//		this.brand = brand;
//		this.model = model;
//	}
	private String color;
	private	double price;
	private String brand;
	private String model;
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void start() {
		System.out.println("car is starting");
	}
	
	public void changeGear(int gear) {
		System.out.println("car is in" + gear);
	}
	
	public void stop() {
		System.out.println("car is stopping..");
	}
	
	
}
