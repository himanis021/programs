import java.util.Scanner;
class A1q3
{
	public static void main(String []ar)
	{
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.  ");
		int n=Integer.parseInt(sc.nextLine());
		while(n>0)
		{	
			
			num=n%10;
			sum=sum+num;
			n=n/10;
		}
		System.out.println("sum of digits is :  "+sum);
	}
}