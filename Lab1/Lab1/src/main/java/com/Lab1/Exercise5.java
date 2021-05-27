package com.Lab1;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Exercise5 {

	public  static int caluclateSum() throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number:");
		String num=br.readLine();
		int c=Integer.parseInt(num);
  
		for(int i=1;i<=c;i++)
		{
			if(i%3==0 || i%5==0)
			{
				System.out.print(i+", ");;
			}
			
		}
		return c;
		
	}
	public static void  main(String[] args) throws Exception
	{
		caluclateSum();
	}

}
