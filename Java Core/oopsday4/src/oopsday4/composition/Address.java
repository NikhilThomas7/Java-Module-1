package oopsday4.composition;

public class Address {
	
	
		
	
	
	private String doorNo;
	private String bulidingName;
	private String street;
	private String city;
	private long pin;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getBulidingName() {
		return bulidingName;
	}

	public void setBulidingName(String bulidingName) {
		this.bulidingName = bulidingName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public Address(String doorNo, String bulidingName, String street, String city, long i) {
		super();
		this.doorNo = doorNo;
		this.bulidingName = bulidingName;
		this.street = street;
		this.city = city;
		this.pin = i;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", bulidingName=" + bulidingName + ", street=" + street + ", city=" + city
				+ ", pin=" + pin + "]";
	}
	
	
	

}
