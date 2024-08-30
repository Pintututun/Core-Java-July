package sortingOperationUsingComparatorInterface;

import java.util.Comparator;

public class CustomerNumberComparator implements Comparator<Customer> {
	public int compare(Customer c1,Customer c2)
	{
		return c1.getCustomerNumber().compareTo(c2.getCustomerNumber());
	}
	
}
