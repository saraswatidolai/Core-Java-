package this_keyword;

public class Customer {
	int customerId;
	String customerName;
	
	public void setCustomerData(int customerId, String   customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	public void getCustomerData() {
		System.out.println("Customer Id is: "+customerId);
		System.out.println("Customet Name is: "+customerName);
	}
}
