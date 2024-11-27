


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student{
	private int sid;
	private String sname;
	private float sfees;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public float getSfees() {
		return sfees;
	}

	public void setSfees(float sfees) {
		this.sfees = sfees;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
}

class StudentSortID implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getSid()<o2.getSid())//data ascending order
			return -1;
		else if(o1.getSid()>o2.getSid())
			return 1;
		else
			return 0;
	}
	
}

class StudentSortName implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getSname().compareTo(o2.getSname())<0)
			return -1;
		else if(o1.getSname().compareTo(o2.getSname())>0)
			return 1;
		else
			return 0;
	}
}

//sort based fees
class SortStudentFees implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getSfees()<o2.getSfees())
			return -1;
		else if(o1.getSfees()>o2.getSfees())
			return 1;
		else 
			return 0;
	}
	
}

public class ArrayListDemo{

	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();
		Student s1 = new Student(21,"Dheeraj",9876);
		Student s2 = new Student(2,"Khanfhgj",8876);
		Student s3 = new Student(7,"Deepa",7876);
		Student s4 = new Student(2,"Kiran",4876);
		Student s5 = new Student(1,"Manoj",14876);
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		slist.add(s5);
		
		System.out.println(slist);
		
//		for(Student s:slist) {
//			System.out.println(s);
//		}
		
		//Using Iterator
		
		/*Iterator<Student> itobj = slist.iterator();
		
		System.out.println("sid\tsname\tsfees");
		System.out.println("----------------------");
		while(itobj.hasNext()) {
			Student s=itobj.next();
			//System.out.println(itobj.next());
			System.out.println(s.getSid()+"\t"+s.getSname()+"\t"+s.getSfees());
		}
		
		StudentSortID sortid=new StudentSortID();
		
        Collections.sort(slist,sortid);
        Iterator<Student> itobj1 = slist.iterator();
        System.out.println("After sorting student data");
        
        System.out.println("sid\tsname\tsfees");
		System.out.println("----------------------");
		while(itobj1.hasNext()) {
			Student s=itobj1.next();
			//System.out.println(itobj.next());
			System.out.println(s.getSid()+"\t"+s.getSname()+"\t"+s.getSfees());
		}
        
//Sort Based on name
		StudentSortName sortname = new StudentSortName();
		Collections.sort(slist,sortname);
		
		System.out.println("Sort data based name");
		Iterator<Student> sitr = slist.iterator();
		
		while(sitr.hasNext()) {
			Student s=sitr.next();
			System.out.println(s.getSid()+"\t"+s.getSname()+"\t"+s.getSfees());
		}
		*/
		//based on fees
		
		SortStudentFees sfeeobj = new SortStudentFees();
		Collections.sort(slist,sfeeobj);
		
		Iterator<Student> itr = slist.iterator();
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s.getSid()+"\t"+s.getSname()+"\t"+s.getSfees());
		}
		
		
	}

}
//Employee class sort data based id, name, salary

