import java.util.*;
public class Hashset {
	public static void main(String args[]) {
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(12);
		h.add(12);
		h.add(121);
		h.add(122);
		h.add(null);
		System.out.println(h);
		LinkedHashSet<Integer> h1=new LinkedHashSet<Integer>();
		h1.add(12);
		h1.add(12);
		h1.add(121);
		h1.add(122);
		h1.add(null);
		System.out.println(h1);
		TreeSet<Integer> h2=new TreeSet<Integer>();
		h2.add(12);
		h2.add(12);
		h2.add(121);
		h2.add(122);
		//h2.add(null);
		System.out.println(h2);
	}

}
