import java.util.Scanner;
class height{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		System.out.println(" Enter height in cm :");
		int a=input.nextInt();
		 double b =a/2.54;
			System.out.println("Enter height in inches"+b);
			double c = b/12;
			System.out.println("Enter height in foots"+c);
			
		
	}
}