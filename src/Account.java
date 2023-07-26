import java.text.DecimalFormat;
import java.util.Scanner;
public class Account 
{
	private int customerNumber;
	private int pinNumber;
	private double checkingBlance=5000;
	private double savingBlance=5000;
	
	Scanner input=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	public int getCustomerNumber() 
	{
		return customerNumber;
	}
	public int setCustomerNumber(int customerNumber) 
	{
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	public int getPinNumber() 
	{
		return pinNumber;
	}
	public int setPinNumber(int pinNumber) 
	{
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	public double getCheckingBlance() 
	{
		return checkingBlance;
	}
	public double getSavingBlance() 
	{
		return savingBlance;
	}
	
	
	public double calcCheckingWithdraw(double amount)
	{
		checkingBlance=(checkingBlance-amount);
		return checkingBlance;
	}
	public double calcSavingWithdraw(double amount)
	{
		savingBlance=(savingBlance-amount);
		return savingBlance;
	}
	public double calcCheckingDeposit(double amount)
	{
		checkingBlance=(checkingBlance+amount);
		return checkingBlance;
	}
	public double calcSavingDeposit(double amount)
	{
		savingBlance=(savingBlance+amount);
		return savingBlance;
	}
	
	public void getCheckingWithdrawInput()
	{
		System.out.println("Checking Account Blance: "+moneyFormat.format(checkingBlance));
		System.out.println("Amount you want to Withdrawl from Checking Account");
		double amount=input.nextDouble();
		
		     if((checkingBlance-amount) >=0)
		     {
		    	 calcCheckingWithdraw(amount);
		    	 System.out.println("New Checking Account Blance: "+moneyFormat.format(checkingBlance));
		     }
		     else
		     {
		    	 System.out.println("Blance cannot be Negative."+"\n");
		     }
	}
	
	
	public void getSavingWithdrawIntpu()
	{
		System.out.println("Saving Account Blance: "+moneyFormat.format(savingBlance));
		System.out.println("Amount you want to Withdrawl from Saving Account");
		double amount=input.nextDouble();
		
		     if((savingBlance-amount) >=0)
		     {
		    	 calcSavingWithdraw(amount);
		    	 System.out.println("New Saving Account Blance: "+moneyFormat.format(savingBlance));
		     }
		     else
		     {
		    	 System.out.println("Blance cannot be Negative."+"\n");
		     }
	}
	
	
	public void getCheckingDepositInput()
	{
		System.out.println("Checking Account Blance: "+moneyFormat.format(checkingBlance));
		System.out.println("Amount you want to Deposit from Checking Account");
		double amount=input.nextDouble();
		
		     if((checkingBlance-amount) >=0)
		     {
		    	 calcCheckingDeposit(amount);
		    	 System.out.println("New Checking Account Blance: "+moneyFormat.format(checkingBlance));
		     }
		     else
		     {
		    	 System.out.println("Blance cannot be Negative."+"\n");
		     }
	}
	
	
	public void getSavingDepositInput()
	{
		System.out.println("Saving Account Blance: "+moneyFormat.format(savingBlance));
		System.out.println("Amount you want to Deposit from Saving Account");
		double amount=input.nextDouble();
		
		     if((savingBlance-amount) >=0)
		     {
		    	 calcSavingDeposit(amount);
		    	 System.out.println("New Saving Account Blance: "+moneyFormat.format(savingBlance));
		     }
		     else
		     {
		    	 System.out.println("Blance cannot be Negative."+"\n");
		     }
	}
}


