package cab_collection_program;

import java.util.Scanner;

public class CabCustomerServiceTester {
public static void main(String[] args) {
	CabCustomerService cabService=new CabCustomerService();
	CabCustomer john = new CabCustomer(1, "JOHN", "A", "B", 5, "1234567890");
    CabCustomer smith = new CabCustomer(2, "SMITH", "X", "Y", 3, "1234567890");

    cabService.addCabCustomer(john);
    cabService.addCabCustomer(smith);

    String johnBill = cabService.printBill(john);
    String smithBill = cabService.printBill(smith);

    System.out.println(johnBill); // Output: JOHN Please pay your bill of Rs.180.0
    System.out.println(smithBill); // Output: SMITH Please pay your bill of Rs.80.0
}
}

