package sortingOperationUsingComparatorInterface;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {
public int compare(Customer c1,Customer c2)
{
	return c1.getCustomerName().compareTo(c2.getCustomerName());
}
}
