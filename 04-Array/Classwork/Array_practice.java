import java.util.Scanner;
import java.util.Arrays;
class Array_practice{
	public static void main (String args[]){
		int arr[]={5,8,16,45,68,55};
		for(int i = 0 ; i< arr.length;i++){
			for(int j = 0; j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
					

				}
			}
		
		}
		System.out.println(Arrays.toString(arr));
	}
}