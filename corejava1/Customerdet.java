package corejava1;

public class Customerdet {
	
	public Customerdet() {}
	
	private int customid;
	private String Name;
	private Association Address;
	private Association homeaddress;
	private Association officeaddress;
	
	public int getCustomid() {
		return customid;
	}
	public void setCustomid(int customid) {
		this.customid = customid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Association getAddress() {
		return Address;
	}
	public void setAddress(Association address) {
		Address = address;
	}
	public Association getHomeaddress() {
		return homeaddress;
	}
	public void setHomeaddress(Association homeaddress) {
		this.homeaddress = homeaddress;
	}
	public Association getOfficeaddress() {
		return officeaddress;
	}
	public void setOfficeaddress(Association officeaddress) {
		this.officeaddress = officeaddress;
	}
	@Override
	public String toString() {
		return "Customerdet [customid=" + customid + ", Name=" + Name + ", Address=" + Address + ", homeaddress="
				+ homeaddress + ", officeaddress=" + officeaddress + "]";
	}
	
	
}
