import java.util.*;
class A2q2
{
	int i=10;
	static int j=15;
	void funct1()
	{
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		i++;
		j++;
	}
	static void funct2()
	{
		int a=10;
		//System.out.println("i= "+i);  cannot be accessed as it is nonstatic member..........
		System.out.println("j= "+j);
		System.out.println("a= "+a);
		System.out.println("a+j= "+(a+j));
	}
	

	/*int funct3()
	{
		return a+a;         cannot use a here bcz it has local
	}                            scope in funct2.....
	static int funct4()
	{
		return a+a;
	}*/

	
	
	public static void main(String []args)
	{
		A2q2 ob=new A2q2();
		ob.funct1();
		ob.funct2();
		//ob.funct3();
		//ob.funct4();
	}
}


	
