package Pack_1;

public class Student {
	int rollNo;
	int age;
	public void display1 ()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2 ()	
	{
		System.out.println("automation is very easy");
	}
	public static void main(String[] args) 
	{
		Student abc=new Student();
		abc.display1();
		abc.display2();
		abc.rollNo=4;
		abc.age=5;
		
		System.out.println(abc.rollNo);
		System.out.println(abc.age);}
}




	
	
	
	


