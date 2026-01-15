import java.util.Scanner;
class discountfee{
	public static void main (String args[])
	{
	Scanner input = new Scanner (System.in);
	System.out.println("fee : ");
	int fee=input.nextInt();
	System.out.println("discount percent : ");
	int discount_percent=input.nextInt();
	int discount=(fee/100)*10;
	System.out.println("Net_fee : "+(fee - discount));
	}
}