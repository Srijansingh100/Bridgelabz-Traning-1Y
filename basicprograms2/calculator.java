import java.util.Scanner;
class calculator{
	public static void main (String args[]){
	Scanner input= new Scanner(System.in);
	System.out.println("Enter first no. ");
	double a= input.nextDouble();
	System.out.println("Enter second no.");
	double b = input.nextDouble();
	System.out.println("ADD : "+(a+b));
	System.out.println("Subtract : "+(a-b));
	System.out.println("Divide : "+(a/b));
	System.out.println("Multiply : "+(a*b));
	}
} 