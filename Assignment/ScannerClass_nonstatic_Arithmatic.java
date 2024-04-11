package Assignment;
import java.util.*;
public class ScannerClass_nonstatic_Arithmatic 
{
	void add()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enetr the valu of a: ");
		int a1=s1.nextInt();
		System.out.println("Enetr the valu of b: ");
		int b1=s1.nextInt();
		int add=a1+b1;
		System.out.println("The Addition= " +add);
		s1.close();
	}	
	void sub()
	{
		Scanner s2=new Scanner(System.in);
		System.out.println("Enetr the valu of a: ");
		int a2=s2.nextInt();
		System.out.println("Enetr the valu of b: ");
		int b2=s2.nextInt();
		int sub=a2-b2;
		System.out.println("The subtraction= " +sub);
	}	
	void mul()
	{
		Scanner s3=new Scanner(System.in);
		System.out.println("Enetr the valu of a: ");
		int a3=s3.nextInt();
		System.out.println("Enetr the valu of b: ");
		int b3=s3.nextInt();
		int mul=a*b;
		System.out.println("The Multiplication= " +mul);
	}	
	void div()
	{
		Scanner s4=new Scanner(System.in);
		System.out.println("Enetr the valu of a: ");
		int a4=s4.nextInt();
		System.out.println("Enetr the valu of b: ");
		int b4=s4.nextInt();
		int div=a4/b4;
		System.out.println("The Addition= " +div);
	}	
	void mod()
	{
		Scanner s5=new Scanner(System.in);
		System.out.println("Enetr the valu of a: ");
		int a5=s5.nextInt();
		System.out.println("Enetr the valu of b: ");
		int b5=s5.nextInt();
		int mod=a5%b5;
		System.out.println("The Modulus= " +mod);
	}	
	
	public static void main(String[] args) 
	{
		Scanner s6=new Scanner(System.in);
		s6.add();
		s6.sub();
		s6.mul();
		s6.div();
		s6.mod();
		s6.close();
	}
}
