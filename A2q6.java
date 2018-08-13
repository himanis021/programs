class parent
{
	parent(int i)
	{
		this(5,6);
		System.out.println("CONSTRUCTOR = P");
	}
	parent(int i,int j)
	{
		System.out.println("CONSTRUCTOR = P2");
	}
}
class child extends parent
{
	child()
	{
		super(6);
		System.out.println("CONSTRUCTOR = C");
	}
}
class A2q6
{
	public static void main(String []ar)
	{
		child c=new child();
	}
}		