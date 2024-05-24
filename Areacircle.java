class Areacircle
{
	public static void main(String args[])
	{
	int length=8;
	int breadth=4;
	double radius=2.5;
	double per_rec=2*(length+breadth);
	double area_rec=(length)*(breadth);
	double circum_cir=2*(Math.PI)*radius;
	double area_cir=Math.PI*radius*radius;
	System.out.println(per_rec);
	System.out.println(area_rec);
	System.out.println(circum_cir);
	System.out.println(area_cir);

	}
}