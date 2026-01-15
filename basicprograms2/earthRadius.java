class earthRadius {
	public static void main (String args[])
	{
		double pi =3.14;
		int r = 6378;
		double volume = (4/3)*pi*r*r*r;
		System.out.println("Total volume of earth : "+volume);
		double miles = volume*1.6*1.6*1.6;
		System.out.println("earth radius in miles : "+miles);
	}
}