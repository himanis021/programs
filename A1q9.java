import java.util.*;
class A1q9
{
	static int fact(int n)
	{
		if(n==0)
		return 1;
		else
		return n*fact(n-1);
	}
	public static void main(String []ar)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. ");
		num=Integer.parseInt(sc.nextLine());
		System.out.println("FACTORIAL OF A NUM IS "+fact(num));
		
	}
}