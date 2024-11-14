package oopscocept;
class Animal{
	void sound() {
		System.out.println("some sound");
		}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Bark");
		}
}
class Cat extends Animal{
	void sound() {
		System.out.println("Meow");
		}
}

public class ParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cat c=new Cat();
        Dog d=new Dog();
        c.sound();
        d.sound();
	}

}
