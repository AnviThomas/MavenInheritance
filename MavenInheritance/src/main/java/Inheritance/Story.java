package Inheritance;



public class Story {
	double place;
	float age;
	Book e;
Story (double place , float age , Book e)
{
	this.place=place;
	this.age=age;
	this.e=e;
}
public void display()
{
	System.out.println(e.a );
	System.out.println(e.b);
	System.out.println(place + " " + age );
}
	public static void main(String[] args) {
		Book obj= new Book("ANVI",  45);
		Story obj1=new Story(526852, 12.2f,obj );
		obj1.display();
	}
}
