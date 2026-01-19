import java.util.Scanner;
class areaOfTriangle{
	public static void main(String args[]){
		Scanner a = new Scanner(System.in);
		System.out.print("Enter base of triangle : ");
		int b = a.nextInt();
		System.out.print("Enter height of triangle : ");
		int c = a.nextInt();
		double area =0.5*b*c;
		System.out.println("Area of triangle : "+ area);
 	}
}