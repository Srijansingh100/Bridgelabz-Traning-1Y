import java.util.Scanner;
class sideOfSquare{
	public static void main (String args[]){
		Scanner sqr = new Scanner(System.in);
		System.out.print("Enter side of Square : ");
		int a= sqr.nextInt();
		double area = a*a;
		System.out.println("Side of Square is : "+ area);
	}
	
}