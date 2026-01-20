import java.util.Scanner;
class kmtomiles{
	public static void main(String args[])	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter km");
		int km=input.nextInt();
		double miles = km*1.6;
		System.out.println("total miles :"+miles);
	}
}