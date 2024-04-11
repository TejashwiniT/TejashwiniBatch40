package Assignment;
import java.util.*;
public class AreaofClircle_int 
{
	final static double pi=3.14;
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r=s1.nextInt();
		double area=(pi*r*r);
		System.out.println("Area of the circle= "+area);
		s1.close();
	}
}
