import java.util.*;
class fruit
{
	String name;
	int num;
	float price;
	fruit()
	{	
		name="mango";
		num=10;
		price=20.00f;
	}
	void getfruit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name  ");
		name=sc.nextLine();
		System.out.println("enter number of fruits  ");
		num=Integer.parseInt(sc.nextLine());
		System.out.println("enter price  ");
		price=Float.parseFloat(sc.nextLine());
		
	}
	void displayfruit()
	{
		System.out.println("NAME OF FRUIT IS     : "+name);
		System.out.println("NUMBER OF FRUITS IS  :  "+num);
		if(num==1)
				System.out.println("single fruit");
		else
				System.out.println("bunch of fruits");
		System.out.println("PRICE OF FRUIT IS    :  "+price);	
	}
}
class A1q8
{
	public static void main(String []ar)
	{
		fruit f=new fruit();
		fruit f1=new fruit();
		f.displayfruit();
		f1.getfruit();
		f1.displayfruit();
	}
}				
