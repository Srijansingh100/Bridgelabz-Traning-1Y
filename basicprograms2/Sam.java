import java.util.Scanner;
class Sam{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter MATHS marks :");
	int a = input.nextInt();
	System.out.println("Enter PHYSICS marks :");
	int b = input.nextInt();
	System.out.println("Enter JAVA marks :");
	int c = input.nextInt();
	float avg = (a+b+c)/3f;
	System.out.println("Sam avg marks :-"+avg);
	}
}