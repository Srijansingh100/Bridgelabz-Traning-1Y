import java.util.Scanner;
class unitpen {
	public static void main(String args[]){
		Scanner up = new Scanner(System.in);
		System.out.print("enter price of 1 pen : ");
		int a= up.nextInt();
		System.out.print("enter no. of pen : ");
		int b = up.nextInt();
		double price = a*b;
		System.out.println("total price of pen : "+price);
	}
}