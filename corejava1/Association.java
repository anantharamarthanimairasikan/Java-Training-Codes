package corejava1;

public class Association {
	
	public Association() {
	}
	private int Addressid;
	private int houseno;
	private String Streetname;
	private String city;
	private int pincode;
	
	
	public int getAddressid() {
		return Addressid;
	}
	public void setAddressid(int addressid) {
		Addressid = addressid;
	}
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getStreetname() {
		return Streetname;
	}
	public void setStreetname(String streetname) {
		Streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return  Addressid+","+ houseno + "," + Streetname + ","
				+ city + "," + pincode;
	}
	
	
	

}
