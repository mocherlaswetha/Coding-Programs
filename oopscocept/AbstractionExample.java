package oopscocept;
abstract class Vehicle{
	abstract void  move();
}
class bike extends Vehicle{
	void move() {
		System.out.println("Bike");
	}
}
class car extends Vehicle{
	void move() {
		System.out.println("Car");
	}
}
public class AbstractionExample {
	public static void main(String[] args) {
       
        Vehicle myCar = new car();
        Vehicle myBike = new bike();
        myCar.move(); 
        
        myBike.move();
    }

}
