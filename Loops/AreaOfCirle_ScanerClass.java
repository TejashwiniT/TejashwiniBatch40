//Write a program of area of the circle with human input for 10 times 
package Loops;
import java.util.*;
public class AreaOfCirle_ScanerClass 
{	
	static double pi=3.14;
	public static void main(String[] args) 
	{
		for(int i=0;i<=10;i++)
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the radius");
			int r=s1.nextInt();
			double area=(pi*r*r);
			System.out.println("The area of the circle= " +area);	
			//s1.close();
		}
	}
}
