package cab_collection_program;

import java.util.ArrayList;

public class CabCustomerService {
private ArrayList<CabCustomer> customerlist;

public CabCustomerService() {
	customerlist=new ArrayList<CabCustomer>();
}
public void addCabCustomer(CabCustomer customer)
{
	customerlist.add(customer);
}
public boolean isFirstCustomer(CabCustomer customer)
{
	for(CabCustomer existingCustomer:customerlist)
	{
		if (existingCustomer.getPhone().equals(customer.getPhone())) {
            return false; // Not the first customer
        }
	}
	return true;
}
public double calculateBill(CabCustomer customer) {
    if (isFirstCustomer(customer)) {
        return 0; // New customer
    } else {
        int distance = customer.getDistance();
        if (distance <= 4) {
            return 80.0;
        } else {
            return 80.0 + 6.0 * (distance - 4);
        }
    }
}
public String printBill(CabCustomer customer) {
    double billAmount = calculateBill(customer);
    return customer.getCustomerName() + " Please pay your bill of Rs." + billAmount;
}

}
