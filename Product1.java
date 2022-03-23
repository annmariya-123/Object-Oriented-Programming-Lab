class Product
{
	int pcode;
	String pname;
	int pcost;
	void display()
	{
		System.out.println(pcode+":"+pname+":"+pcost);
	}
}
class Product1
{
	public static void main(String args[])
	{
		Product p1=new Product();
		p1.pcode=1001;
		p1.pname="ABC";
		p1.pcost=1000;
		p1.display();
		Product p2=new Product();
		p2.pcode=1002;
		p2.pname="PQR";
		p2.pcost=1500;
		p2.display();
		Product p3=new Product();
		p3.pcode=1003;
		p3.pname="XYZ";
		p3.pcost=1250;
		p3.display();
		
		if(p1.pcost<p2.pcost && p1.pcost<p3.pcost)
		{
			System.out.println(p1.pname+" has lowest cost");
		}
		else if(p2.pcost<p1.pcost && p2.pcost<p3.pcost)
		{
			System.out.println(p2.pname+" has lowest cost");
		}
		else
		{
			System.out.println(p3.pname+" has lowest cost");
		}
	}
}
