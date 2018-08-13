import java.util.*;
class A1q7
{
	public static void main(String []ar)
	{
		String ch;
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius ");
		r=Integer.parseInt(sc.nextLine());
		System.out.println("ENTER UR CHOICE \n 1.Diameter\n 2.Area\n 3.Circumference\n 4.Exit" );
		ch=sc.nextLine();
		switch(ch)
		{
		case "1" : 
			System.out.println("Diameter is "+(2*r));
			break;
		case "2" :
			System.out.println("Area is "+(3.14*r*r));
			break;
		case "3" :
			System.out.println("Circumference is "+(2*3.14*r));
			break;
		case "4" : 
			break;
		default: System.out.println("invalid choice");	
		}
	}
} 