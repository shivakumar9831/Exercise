package com.Lab1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise3 {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		String num=br.readLine();
		int c=Integer.parseInt(num);
		int a=0;int b=1;
		System.out.print(a+" "+b);
		
		for(int i=1;i<=10;i++)
		{ 
			c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		}

	}

}
