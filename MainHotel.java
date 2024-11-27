import java.util.*;
class Customer{
	String name;
	int numberOfRooms;
	public Customer(String name, int numberOfRooms) {
		//super();
		this.name = name;
		this.numberOfRooms = numberOfRooms;
	}
	
}
class Hotel{
	List<String> coustmername=new ArrayList<>();
	int roomsBooked =0;
	public String CheckIn(Customer cust) {
		if(cust.numberOfRooms>10)
		return "No rooms available";
		else
			return "Checked in";
		
	}
	public String CheckRooms(Customer cust){
		if(cust.numberOfRooms>0)
		return "No";
		else
			return "Yes";
		
	}
}
public class MainHotel {
	public static void main(String args[]) {
		Customer cust=new Customer("Doselect",4);
		Hotel hotel=new Hotel();
		String result=hotel.CheckIn(cust);
		System.out.println(result);
	}

}
