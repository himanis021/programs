import java.util.*;
class assign1
{
	public static void main(String [] args)
	{
		int rowsum=0;
		int colsum=0;
		int[][] sales=new int[5][5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				sales[i][j]=sc.nextInt();
			}
		}
		System.out.println("     P1  P2  P3  P4  total");
		for(int i=0;i<sales.length;i++)
		{
			
			System.out.print("S"+(i+1));
			for(int j=0;j<sales.length;j++)
			{
				System.out.print("   "+sales[i][j]+" ");
				
			}
			
			System.out.print("\n\n");
		}
		
		for(int i=0;i<4;i++)
		{
			rowsum=0;
			for(int j=0;j<4;j++)
			{
				rowsum+=sales[i][j];
			}	
			
			System.out.println("  "+rowsum);
		}	
		for(int j=0;j<4;j++)
		{
			
			//for(int i=0;i<4;i++)
			//{
				colsum+=sales[i][j];
			//}	
			
			System.out.println("  "+colsum);
		}	
				
		
	}
}