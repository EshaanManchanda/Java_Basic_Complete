package InputOutput;
import java.util.Scanner;
public class Array_IO {
	public static int[] sort_array={20,50,66,67,80,90,100};
	public static int[] unsort_array={50,110,66,27,80,60,10};
	public static int[] ArrInput()
	{
		Scanner enter=new Scanner(System.in);
		System.out.print("Enter How many number you want to add: ");
		int size=enter.nextInt();
		int[] array= new int[size];
		System.out.println("Enter value here:- ");
		for(int i=0;i<size;i++)
		{
			array[i]=enter.nextInt();
		}
		enter.close();
		return array;
	}
	public static int[] ArrInput(int size)
	{
		Scanner enter=new Scanner(System.in);
		int[] array= new int[size];
		System.out.println("Enter value here:- ");
		for(int i=0;i<size;i++)
		{
			array[i]=enter.nextInt();
		}
		enter.close();
		return array;
	}
	public static void ArrOutput(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+",");
		}
		System.out.println();
	}
	
}

