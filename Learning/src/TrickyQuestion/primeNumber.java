package TrickyQuestion;
import java.util.Scanner;

public class primeNumber {
	public void primeNum()
	{
		Scanner enter=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=enter.nextInt();
//		boolean check=primeWhile(num);
		boolean check=primeFor(num);
		if(check==true)
		{
			System.out.println(num+" is prime number.");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}
	}
	boolean primeWhile(int num)
	{
		if(num==0||num==1)
		{
			return false;
		}
		else
		{
			int div=2;
			while(div<(num/2))
			{
				if(num%div==0)
				{
					return false;
				}
				else
				{
					div++;
				}
			}
			return true;
		}
	}
	boolean primeFor(int num)
	{
		if(num==1||num==0)
		{
			return false;
		}
		else
		{			
			for(int i=2;i<(num/2);i++)
			{
				if(num%i==0)
				{
					return false;
				}
			}
		}
		return true;
	}
}
