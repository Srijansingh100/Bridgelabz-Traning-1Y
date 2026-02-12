import java.util.Scanner;
import java.util.Arrays;
class license 
{
	public static void main (String args[]){
		Scanner a= new Scanner(System.in);
		int b = a.nextInt();
		int arr []= new int[b];
		for(int i = 0;i<b;i++){
			arr[i]=a.nextInt();
			if(arr[i]>18){
				System.out.println("the persom is eligible to drive : ");
			}
			else if(arr[i]<0){
				System.out.println("invalid : ");
			}
			else{
				System.out.println("not eligible to drive : ");
			}
		}
	}
}