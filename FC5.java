/* Intialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s a number then print "Digit" and for other characters print "Special Character"*/

import java.util.*;
class FC5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character... ");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		System.out.println("Alphabet");
		else if(ch>='0' && ch<='9')
		System.out.println("digit");
		else
		System.out.println("Special character");
	}
}
		