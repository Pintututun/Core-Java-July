package sortingOperationUsingComparatorInterface;

public class Customer {
private Integer customerNumber;
private String customerName;
private Double customerBill;
public Customer(Integer customerNumber, String customerName, Double customerBill) {
	super();
	this.customerNumber = customerNumber;
	this.customerName = customerName;
	this.customerBill = customerBill;
}
protected Integer getCustomerNumber() {
	return customerNumber;
}
protected void setCustomerNumber(Integer customerNumber) {
	this.customerNumber = customerNumber;
}
public String getCustomerName() {
	return customerName;
}
protected void setCustomerName(String customerName) {
	this.customerName = customerName;
}
protected Double getCustomerBill() {
	return customerBill;
}
protected void setCustomerBill(Double customerBill) {
	this.customerBill = customerBill;
}
@Override
public String toString() {
	return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerBill="
			+ customerBill + "]";
}


}
