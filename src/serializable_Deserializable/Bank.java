package serializable_Deserializable;

import java.io.Serializable;
import java.util.Scanner;

public class Bank implements Serializable {
	private Integer ifscCode;
	private transient String bankName;//transient keyword makes bankName default
	private String bankAddress;
	
	public Bank(Integer ifscCode, String bankName, String bankAddress) 
	{
		super();
		this.ifscCode = ifscCode;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
	}

	@Override
	public String toString() 
	{
		return "Bank [ifscCode=" + ifscCode + ", bankName=" + bankName + ", bankAddress=" + bankAddress + "]";
	}
	
    public static Bank getBankObject()
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bank IFSC code :");
        int code = sc.nextInt();
        System.out.print("Enter Bank Name :");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter Bank Address :");
        String addr = sc.nextLine();
        
       	return new Bank(code, name, addr);
    }
}
