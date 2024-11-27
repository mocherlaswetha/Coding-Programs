import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
	HashMap<Integer,String> h=new HashMap<Integer,String>();
	h.put(101,"Swetha");
	h.put(102,"Swetha");
	h.put(103,"Swe");
	h.put(102,"Swetha");
	h.put(106,"six");
	h.put(108,"eight");
	h.put(105,"five");
	System.out.println(h);
	LinkedHashMap<Integer,String> h1=new LinkedHashMap<Integer,String>();
	h1.put(101,"Swetha");
	h1.put(102,"Swetha");
	h1.put(103,"Swe");
	h1.put(102,"Swetha");
	h1.put(106,"six");
	h1.put(108,"eight");
	h1.put(105,"five");
	
	System.out.println(h1);
	TreeMap<Integer,String> h2=new TreeMap<Integer,String>();
	h2.put(101,"Swetha");
	h2.put(102,"Swetha");
	h2.put(103,"Swe");
	h2.put(102,"Swetha");
	h2.put(106,"six");
	h2.put(108,"eight");
	h2.put(105,"five");
	System.out.println(h2);
	for(Map.Entry<Integer,String>m:h.entrySet()) {
		System.out.println(m.getKey()+"\t"+m.getValue());
	}
	
	}

}
