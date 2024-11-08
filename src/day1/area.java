package day1;
import java.util.*;
public class area {
	public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter name of figure to find its area");
   String str=sc.next();
   switch(str) {
   case "triangle":
	   double h=sc.nextDouble();
	   double b=sc.nextDouble();
	   double area=0.5f*b*h;
	   System.out.println(area+ " is area of triangle");
	   break;
   case "rectangle":
	   int length=sc.nextInt();
	   int width=sc.nextInt();
	   int areaR=length*width;
	   System.out.println(areaR+" is area of rectangle");
	   break;
   case "square":
	   int side=sc.nextInt();
	   int areas=side*side;
	   System.out.println(areas+" is area of square");
	   break;
   case "circle":
	   double r=sc.nextDouble();
	   double pi=3.14f;
	   double areac=pi*r*r;
	   System.out.println(areac+" is area of square");
	   break;
   default:
  	 System.out.println("invalid");
  	
	   }
    
	}
   
}
