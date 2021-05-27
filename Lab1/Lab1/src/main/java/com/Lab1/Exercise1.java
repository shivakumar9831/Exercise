package com.Lab1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		String num=br.readLine();
		int num1=Integer.parseInt(num);
		for(int i=0;i<=num1;i++)
		{
			int j=i*i*i;
			int k=j+i;
			System.out.println(k);
		}

	}
}

