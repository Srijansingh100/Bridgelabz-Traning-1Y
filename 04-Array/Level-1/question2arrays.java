import java.util.*;
class question2arrays {
	public static void main (String args []){
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];
		System.out.println("Enter 5 numbers = ");
		for(int i = 0; i<arr.length;i++){
			arr[i]= sc.nextInt();
		}
		for (int i = 0; i< arr.length;i++){
			if(arr[i]>0){
				System.out.println("positive");
				if(arr[i] %2==0){
					System.out.println("Even");
				}
				else{
					System.out.println("Odd");
				}
			}
			else if(arr[i]<0){
				System.out.println("negative");
				
			}
			else{
				System.out.println("zero");
			}
		}
	}
}