import java.util.Scanner;
class Student{
	public static void main(String agrs[])
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter no. of pen:-");
		int totalPenspen = input.nextInt();
		System.out.println("Enter no. of Student");
		int students=input.nextInt();
		int pensEach = totalPens / students;
        int remainingPens = totalPens % students;

        System.out.println("Each student will get: " + pensEach + " pens");
        System.out.println("Remaining non-distributed pens: " + remainingPens);
	}
}