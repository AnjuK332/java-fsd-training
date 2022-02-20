package training_java;
import java.io.*;
class abc
{
	void draw()
	{
		System.out.println("pencil");
	}
}
class Red extends abc
{
	void draw()
	{
		System.out.println("box");
	}
}
class White extends abc
{
	void draw()
	{
		System.out.println("color");
	}
}
class Black extends abc
{
	void draw()
	{
		System.out.println("lines");
	}
}
 class MethodOverriding2 {
	public static void main(String[] args)
	{
		
		abc b;
		b=new Red();
		b.draw();
		b=new White();
		b.draw();
		b=new Black();
		b.draw();
	}


}
