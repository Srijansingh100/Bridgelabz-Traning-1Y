import java.util.Scanner;
class handshake{
	public static void main (String args[]){
		Scanner hand = new Scanner(System.in);
		System.out.print("no. of hand : ");
		int n = hand.nextInt();
		double handshake = (n * (n - 1)) / 2;
		System.out.println("total handshake : "+ handshake);
	}
}