//Write a program to print odd and even numbers from 1-100
package Loops;
public class ForLoop10 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println("The Even number= "+i);
			}
			else
			{
				System.out.println("The Odd number= " +i);
			}
		}
		
	}
}
