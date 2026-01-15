import java.util.Scanner;
class kilometer_To_Miles{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter KM");
		int km=input.nextInt();
		double miles = km*1.6;
		System.out.println("Enter miles:-"+miles);
	}
}