class feeDiscount{
	public static void main(String args[])
	{
		int fee = 125000;
		int discout_fee = fee/100*10;
		int rem_fee = fee - discout_fee;
		System.out.println("discout fee is : "+discout_fee);
		System.out.println("amout to be payed : "+rem_fee);
	}
} 