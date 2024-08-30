package sortingOperationUsingComparatorInterface;

import java.util.Comparator;

public class CustomerBillComparator implements Comparator<Customer> {
public int compare(Customer c1,Customer c2)
{
	return c1.getCustomerBill().compareTo(c2.getCustomerBill());
}
}
