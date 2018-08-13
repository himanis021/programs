import java.util.*;
class Area
{
	final double pi=3.14;
	void aoc()
	{
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle  ");
		r=Integer.parseInt(sc.nextLine());
		System.out.println("area of circle is  "+(pi*r*r));
	}
	void aocyl()
	{
		int r,h;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of cylinder  ");
		r=Integer.parseInt(sc.nextLine());
		System.out.println("enter the height of cylinder  ");
		h=Integer.parseInt(sc.nextLine());
		System.out.println("area of cylinder is  "+((2*pi*r)*(h+r)));
	}
}
class A2q7
{
	public static void main(String []args)
	{
		Area aa=new Area();
		aa.aoc();
		aa.aocyl();
	}
}		
