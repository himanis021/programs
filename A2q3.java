import java.util.*;
class simplecalc
{
	double a,b;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number  ");
		a=Integer.parseInt(sc.nextLine());
		System.out.println("enter the second number  ");
		b=Integer.parseInt(sc.nextLine());
	}
	void add()
	{
		System.out.println("addition is "+(a+b));
	}
	void sub()
	{
		System.out.println("subtraction is "+(a-b));
	}
	void multi()
	{
		System.out.println("multiplication is "+(a*b));
	}
	void div()
	{
		System.out.println("division is "+(a/b));
	}
	void sqr()
	{
		System.out.println("addition is "+(a*a));
	}
	void sqroot()
	{
		System.out.println("addition is "+(Math.sqrt(a)));
	}
}
class sci_calc extends simplecalc
{
	void sine()
	{
		System.out.println("sine is "+(Math.sin(a)));
	}
	void cosine()
	{
		System.out.println("cosine is "+(Math.cos(a)));
	}
	void tangent()
	{
		System.out.println("sine is "+(Math.tan(a)));
	}
	void sininv()
	{
		System.out.println("sine inverse is "+(Math.sinh(a)));
	}
	void cosinv()
	{
		System.out.println("cos inverse is "+(Math.cosh(a)));
	}
	void taninv()
	{
		System.out.println("tan inverse is "+(Math.tanh(a)));
	}	
}
class A2q3
{
	public static void main(String []args)
	{
		int ch;
		String val;
		sci_calc ob=new sci_calc();
		System.out.println("\n\n----------WELCOME----------");
		System.out.println("\n**********CALCULATOR***********");	
		ob.getdata();
		
		
		do
		{
		System.out.println("SELECT THE OPTION.....\n 1.Addition\n 2.Subtract\n 3.Multiply\n 4.Divide\n 5.Square\n 6.SquareRoot\n 7.Sine\n 8.Cosine\n 9.Tangent\n 10.Sin inverse\n 11.Cosine Inverse\n 12.Tan inverse ");
		Scanner sc=new Scanner(System.in);
		ch=Integer.parseInt(sc.nextLine());
				
			switch(ch)
			{
				case 1: ob.add();
				break;
				case 2: ob.sub();
				break;
				case 3: ob.multi();
				break;
				case 4: ob.div();
				break;
				case 5: ob.sqr();
				break;
				case 6: ob.sqroot();
				break;
				case 7: ob.sine();
				break;
				case 8: ob.cosine();
				break;
				case 9: ob.tangent();
				break;
				case 10: ob.sininv();
				break;		
				case 11: ob.cosinv();
				break;
				case 12: ob.taninv();
				break;	
				default: System.out.println("wrong choice");
				break;
			}
			System.out.println("wanna enter more options....y/n...???");
			val=sc.nextLine();
		}while(val.equals("y"));
	}
}