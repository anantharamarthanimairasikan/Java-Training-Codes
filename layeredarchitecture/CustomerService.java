package layeredarchitecture;

public interface CustomerService {
	public String addCustomer(Customer customer);

	// Retrieve
	public Customer getCustomerById(Integer custId);

	// Update
	public String updateCustomer(Customer customer);

	// Delete
	public String deleteCustomerById(Integer custId);

}
