package com.test;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner enter= new Scanner(System.in);
		int number=enter.nextInt();
//		for(int i=1;i<=number;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=number;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=number;i++)
//		{
//			for(int left=number;left>i;left--)
//			{
//				System.out.print(" ");
//			}
//			for(int right=1;right<=i;right++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i=1;i<=number;i++)
		{
			for(int left=1;left<i;left++)
			{
				System.out.print(" ");
			}
			for(int right=number;right>=i;right--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
