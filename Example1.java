import java.io.*;
import java.util.*;
class Example1
{

public static int getCountOfDigitInPrimeRange(int input1,int input2,int input3)
{
String prime ="";
int count=0;
for(int i=input2;i<=input3;i++)
{
if((prime_number(i))==1)
prime=prime+i;
}
for(int i=0;i<prime.length();i++)
{
int n=(int)(prime.charAt(i)-48);
if(n==input1)
count++;
}
return count;
}
public static int prime_number(int n)
{
for(int i=2;i<=(n/2);i++)
{
if(n%i==0)
return 0;
}
return 1;
}
public static void main(String[] args)

{
System.out.println(getCountOfDigitInPrimeRange(3,11,37));
	
}
}