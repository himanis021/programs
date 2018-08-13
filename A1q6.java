import java.util.Scanner;
class A1q6
{
	public static void main(String []ar)
	{
		int[][] triangle = new int[10][10];
       		triangle[1][1] = 1;
        	System.out.print(triangle[1][1] + "\n");

        	for (int i = 2; i<6; i++) 
		{
            		for (int n = 1; n<6; n++) 
			{
                		triangle[i][n] = triangle[i-1][n-1] + triangle[i-1][n];
               			if (triangle[i][n]>0) 
				{
                    			System.out.print(triangle[i][n] + " ");
                		}
            		}
            		System.out.println();
        	}
	}
}        