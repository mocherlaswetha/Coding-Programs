import java.util.*;

public class Secondsmallestelemnt {

	public int getelement(ArrayList<Integer> a) {
		Collections.sort(a);
		return a.get(1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  ArrayList<Integer> a=new ArrayList<>();
	  Scanner sc = new Scanner(System.in);
	  String input = sc.nextLine();

      String[] inputArray = input.split(" ");
      for (String s : inputArray) {
          a.add(Integer.parseInt(s));
      }
	  Secondsmallestelemnt s=new Secondsmallestelemnt();
	  int res=s.getelement(a);
	  System.out.println(res);
	 // System.out.println(a);      
	}

}
