package week.day1;

public class ClassPrime {
public static void main(String[] args) {
int input=13;
boolean flag=false;
for (int i=2;i<=input/2;i++)
{if (input%i==0)
{
	flag=true;
break;
}
}
if(!flag) 
	System.out.println("it is a prime number");
else
	System.out.println("it is not a prime number");
}
}
