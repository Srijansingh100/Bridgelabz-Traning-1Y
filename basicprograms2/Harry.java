import java.util.Scanner;
class Harry {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter harry birth year :");
		int a=input.nextInt();
		System.out.println("Enter cuurent year :");
		int b=input.nextInt();
		int age=b-a;
		System.out.println("Harry current age"+age);
	}
}