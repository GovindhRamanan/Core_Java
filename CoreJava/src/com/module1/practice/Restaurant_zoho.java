package com.module1.practice;
import java.util.Scanner;
public class Restaurant_zoho 
{

	public static void main(String[] args)
	{
		Scanner uv=new Scanner(System.in);
		System.out.print("Enter a size of order: ");
		int orderSize=uv.nextInt();
		while(orderSize<=10)
		{
		    int orderNum []=new int[orderSize];
		    int i=0;
		    System.out.print("Enter order number: ");
			for(i=0;i<orderSize;i++)
			{
			orderNum[i]=uv.nextInt();
			}
				for( int j:orderNum)
				{
				System.out.print(j+" ");
				}
				System.out.println();
				break;
					/*if(orderNum[i]==)
					{
						System.out.print(orderNum[i]+" ");
					}
					else
					System.out.println("-1");
				}*/
	}}}
/*for(i=0;i<orderSize;i++)
{
	for(int k=orderSize;k>=0;k--) 
	{
	if(orderNum[i]==orderNum[k])
	{
		System.out.print(orderNum[i]+" ");
	}
	else
	System.out.println("-1");
	}
}
*/