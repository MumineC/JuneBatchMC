package assignment4;

public class Pkg_4 {

	int a,b,c,d,e;
	public Pkg_4(int a1, int a2, int a3, int a4, int a5)
	{
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		e=a5;
	}
	public static void main(String[] args){
		Pkg_4 obj1=new Pkg_4(11,112,113,14,15);
			
	
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
		System.out.println(obj1.d);
		System.out.println(obj1.e);
	}
}