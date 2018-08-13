import java.util.*;
class A1q10
{
	public static void main(String []arg)
	{
		int n;
		float i,sum=0.0f;
		Scanner sc=new Scanner(System.in);
		n=Integer.parseInt(sc.nextLine());
		for(i=1;i<=n;i++)
		{	
			sum=sum+(1/i);
		}
		System.out.println("SUM IS   : "+sum);
	}
}