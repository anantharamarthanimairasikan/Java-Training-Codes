package corejava1;

public class Mainapp {

	public static void main(String[] args) {
		Customerdet customer = new Customerdet();
		customer.setCustomid(1);
		customer.setName("Ashwin");
		Association address =  new Association();
		address.setAddressid(1);
		address.setHouseno(12);
		address.setStreetname("Anna Salai");
		address.setCity("Chennai");
		address.setPincode(600100);
		customer.setAddress(address);
		address.setAddressid(2);
		address.setHouseno(12);
		address.setStreetname("Anna Salai");
		address.setCity("Chennai");
		address.setPincode(600100);
		customer.setHomeaddress(address);
		System.out.println(customer);
	}

}
