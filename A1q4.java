import java.util.*;
class A1q4
{
	public static void main(String []ar)
	{
		int i,j,n,flag=0;
		Scanner sc=new Scanner(System.in);
		n=Integer.parseInt(ar[0]);
		for(i=2;i<n;i++)
		{	flag=0;
			for(j=2;j<i;j++)
				{
				if(i%j==0)
				{
				flag=1;
				break;
				}
			}
		if(flag==0)
			{
		System.out.println(i);
			}
			
		}
		
	}
	
}