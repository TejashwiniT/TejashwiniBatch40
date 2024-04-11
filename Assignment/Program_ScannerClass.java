package Assignment;
import java.io.InputStream;
import java.util.*;
import java.util.Scanner;
public class Program_ScannerClass {
	
	int a; 
	int b;
	
	void add()
	{
		int sum=a+b;
		System.out.println("The Addition= "+" " +sum);
		
	}
	void sub()
	{
		
		int sub=a-b;
		System.out.println("The Subtraction= "+" " +sub);
	}
	void multi()
	{
		int mul=a*b;
		System.out.println("The Multiplication= "+" " +mul);
	}
	void div()
	{
	
		int div=a/b;
		System.out.println("The Division= "+" " +div);
	}
	void modulus()
	{
		int mod=a%b;
		System.out.println("The Modulus= "+" " +mod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int s1.nextint(System.in);
		System.out.println("Enter the value of a");
		int s1.nextint(System.in);
		
	}

}