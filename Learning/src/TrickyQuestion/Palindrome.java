package TrickyQuestion;
import java.util.Scanner;
public class Palindrome {
	public void palindromeNum(int num)
	{
		int r,sum=0,temp;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is palindrome number");
		}
		else {
			System.out.println(temp+","+sum+" not palindtome");
		}
	}
	public void palindtromeObj()
	{
		String original,reverse="";
		Scanner enter=new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original=enter.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("Entered String/Number is a palindrome.");
		}
		else {
			System.out.println("Entered String/Number isn't a palindrome.");
		}
	}
}
