package oopscocept;
class Shape{
	void draw() {
		System.out.println("Shape");
	}
}
class rectangle extends Shape{
	void draw() {
		System.out.println("rectangle Shape");
	}
}
class triangle extends Shape{
	void draw() {
		System.out.println("triangle Shape");
	}
}
class circle extends Shape{
	void draw() {
		System.out.println("circle Shape");
	}
}
public class PolymorphisamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape r=new rectangle();
		Shape t=new triangle();
		Shape c=new circle();
		r.draw();
		t.draw();
		c.draw();
		
      
	}

}
