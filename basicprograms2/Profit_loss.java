import java.util.Scanner ;
class Profit_loss{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Enter CP :");
		int cp= input.nextInt();
		System.out.println("Enter SP");
		int sp= input.nextInt();
		int profit= sp-cp;
		double profit_percentage=profit*100/cp;
		System.out.println("PROFIT"+profit);
		System.out.println("profit_percentage"+profit_percentage);
	}
}