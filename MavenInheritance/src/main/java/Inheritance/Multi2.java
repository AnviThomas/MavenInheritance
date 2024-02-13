package Inheritance;


public class Multi2  extends Multichild{
	public void display2()
	{
		System.out.println("Goodmorning    ");
	}
		public static void main(String[] args) {
			Multi2 obj=new Multi2();
			obj.show();
			obj.display();
			obj.display2();
		}
}
