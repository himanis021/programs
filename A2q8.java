import java.util.*;
class A2q8
{
	public static void main(String []arg)
	{	
		int yr;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year  :  ");		
		yr=Integer.parseInt(sc.nextLine());
		if(yr%4==0)
		System.out.println("leap yr");
		else
		System.out.println("not a leap yr ");
	}
}		