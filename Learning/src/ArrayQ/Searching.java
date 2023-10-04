package ArrayQ;

import java.util.Scanner;

public class Searching {
//	Linear Search
//	work on sorted array
//	Time Complexity of Linear Search is O(size)
	static int keyInput()
	{
		Scanner enter=new Scanner(System.in);
		System.out.print("What you want to find: ");
		int key=enter.nextInt();
		enter.close();
		return key;
	}
	public static int linearSearch(int[] array, int size, int key)
	{
		for(int i=0;i<size;i++)
		{
			if(array[i]==key)
			{
				return i; // when it found , it return index where the element is present
			}
		}
		return -1;//if it not found any thing it return -1
	}
	public static int linearSearch(int[] array, int key)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==key)
			{
				return i; // when it found , it return index where the element is present
			}
		}
		return -1;//if it not found any thing it return -1
	}
	public static int linearSearch(int[] array)
	{
		int key=keyInput();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==key)
			{
				return i; // when it found , it return index where the element is present
			}
		}
		return -1;//if it not found any thing it return -1
	}
//	Binary Search
//	work on sorted array
	/*
	 * After first iteration, length of array = n 
	 * After second iteration , length of array = n/2
	 * After third iteration, length of array= (n/2)/2 => n/2^2 => n/2**2 
	 * After k iterations, length of array= n/2^k => n/2**k 
	 * Time Complexity of Binary Search is O(log^n 2) 
	 * */
	public static int binarySearch(int[] array, int size, int key)
	{
		int start=0;
		int end=size;
		while(start<=end)
		{
			int midpoint=(start+end)/2;
			if(array[midpoint]==key)
			{
				return midpoint;
			}
			else if(array[midpoint]>key)
			{
				end=midpoint-1;
			}
			else
			{
				start=midpoint+1;
			}
		}
		return -1;
	}
	public static int binarySearch(int[] array, int key)
	{
		int start=0;
		int end=array.length;
		while(start<=end)
		{
			int midpoint=(start+end)/2;
			if(array[midpoint]==key)
			{
				return midpoint;
			}
			else if(array[midpoint]>key)
			{
				end=midpoint-1;
			}
			else
			{
				start=midpoint+1;
			}
		}
		return -1;
	}
	public static int binarySearch(int[] array, int key, int left, int right)
	{
		while(left<=right)
		{
			int midpoint=left+(right-left)/2;
			if(array[midpoint]==key)
			{
				return midpoint;
			}
			else if(array[midpoint]>key)
			{
				left=midpoint-1;
			}
			else
			{
				right=midpoint+1;
			}
		}
		return -1;
	}
	// overloaded function for exponential search
	public static int binarySearch(int[] array)
	{
		int start=0;
		int end=array.length;
		int key=keyInput();
		while(start<=end)
		{
			int midpoint=(start+end)/2;
			if(array[midpoint]==key)
			{
				return midpoint;
			}
			else if(array[midpoint]>key)
			{
				end=midpoint-1;
			}
			else
			{
				start=midpoint+1;
			}
		}
		return -1;
	}
//	Exponential Search  
//	work on sorted array
//	Time Complexity is O(log n)
	/*
	 * useful for unbounded arrays (infinite size)
	 * work better than binary search
	 * */
	public static int expoentialSearch(int[] array, int key)
	{
		int size=array.length;
		if(array[0]==key)
		{
			return 0;
		}
		int i=1;
		while(i<size && array[i]<=key)
		{
			i*=2;
		}
		return binarySearch(array,key,i/2,Math.min(i, size-1));
	}
	public static int expoentialSearch(int[] array)
	{
		int size=array.length;
		int key=keyInput();
		if(array[0]==key)
		{
			return 0;
		}
		int i=1;
		while(i<size && array[i]<=key)
		{
			i*=2;
		}
		return binarySearch(array,key,i/2,Math.min(i, size-1));
	}
//	Interpolation Search
//	Time Complexity is O(log n) on average
//	O(n) in some cases
	public static int interpolationSearch(int[] array, int key)
	{
		int low=0;
		int high=array.length-1;
		while(low<=high && key>=array[low] && key<=array[high])
		{
			if(low==high)
			{
				if(array[low]== key)
				{
					return low;
				}
				return -1;
			}
			//Estimate position
			int pos=low+((key-array[low])*(high-low)/(array[high]-array[low]));
			
			if(array[pos]==key)
			{
				return pos;
			}
			if(array[pos]< key)
			{
				low=pos+1;
			}
			else {
				high=pos-1;
			}
		}
		return -1;
	}
	public static int interpolationSearch(int[] array)
	{
		int low=0;
		int high=array.length-1;
		int key=keyInput();
//		1condition: in range, other conditions checking key is available or not
		while(low<=high && key>=array[low] && key<=array[high])
		{
			if(low==high)
			{
				if(array[low]== key)
				{
					return low;
				}
				return -1;
			}
			//Estimate position
			int pos=low+((key-array[low])*(high-low)/(array[high]-array[low]));
			
			if(array[pos]==key)
			{
				return pos;
			}
			if(array[pos]< key)
			{
				low=pos+1;
			}
			else {
				high=pos-1;
			}
		}
		return -1;
	}

	public static int ternarySearch(int[] array, int key)
	{
		int start=0;
		int end= array.length-1;
		while(start<=end)
		{
			int mid1=start+(end-start)/3;
			int mid2=end-(end-start)/3;
			if(array[mid1]==key)
			{
				return mid1;
			}
			if(array[mid2]==key)
			{
				return mid2;
			}
			if(key<array[mid1])
			{
				end=mid1-1;
			}
			else if(key>array[mid2])
			{
				start=mid2+1;
			}
			else {
				start=mid1+1;
				end=mid2-1;
			}
		}
		return -1;
	}
	public static int ternarySearch(int[] array)
	{
		int start=0;
		int end= array.length-1;
		int key=keyInput();
		while(start<=end)
		{
			int mid1=start+(end-start)/3;
			int mid2=end-(end-start)/3;
			if(array[mid1]==key)
			{
				return mid1;
			}
			if(array[mid2]==key)
			{
				return mid2;
			}
			if(key<array[mid1])
			{
				end=mid1-1;
			}
			else if(key>array[mid2])
			{
				start=mid2+1;
			}
			else {
				start=mid1+1;
				end=mid2-1;
			}
		}
		return -1;
	}
}
