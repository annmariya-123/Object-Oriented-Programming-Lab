import java.util.*;

public class ComplexNumber
{
	public static void main(String args[])
	{
		int real1,img1,real2,img2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first complex number");
		System.out.println("Real: ");
		real1=sc.nextInt();
		System.out.println("Imaginary: ");
		img1=sc.nextInt();
		System.out.println("Enter second complex number");
		System.out.println("Real: ");
		real2=sc.nextInt();
		System.out.println("Imaginary: ");
		img2=sc.nextInt();
		
		System.out.println("First complex number:"+real1+"+"+img1+"i");
		System.out.println("Second complex number:"+real2+"+"+img2+"i");
		
		int real_add=real1+real2;
		int img_add=img1+img2;
		
		System.out.println("Addition Result is:");
		System.out.println(real_add+"+"+img_add+"i");
	}
}
