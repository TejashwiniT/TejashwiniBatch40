package Assignment;
import java.util.*;
public class ScannerClassArea_double 
{
	final static double pi=3.14;
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of radius: ");
		double r=s1.nextDouble();
		double cir=(2*pi*r);
		System.out.println("The Circumfarance of the Circle= " +cir);
		s1.close();
		
	}
}
