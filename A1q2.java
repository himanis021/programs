import java.util.Scanner;
class A1q2
{
	public static void main(String []ar)
	{
		int p,r,t,si;
		Scanner sc=new Scanner(System.in);
		p=Integer.parseInt(ar[0]);
		r=Integer.parseInt(ar[1]);
		t=Integer.parseInt(ar[2]);
		si=p*r*t;
		System.out.println("SIMPLE INTEREST IS  : "+si);
	}
}		