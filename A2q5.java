import java.util.*;
class avsq
{
	
	avsq(int a)
	{
		System.out.println("area is  "+(a*a));
	}
	avsq(int a,int h)
	{
		System.out.println("volume is  "+(a*a*h));
	}
}
class A2q5
{
	public static void main(String []arg)
	{
		avsq ob1=new avsq(5);
		avsq ob2=new avsq(5,5);
	}
}	