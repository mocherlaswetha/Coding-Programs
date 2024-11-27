


import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class Employee{
private int eid;
private String ename;
private float esalary;

public Employee(int eid, String ename, float esalary) {
super();
this.eid = eid;
this.ename = ename;
this.esalary = esalary;
}


public Employee() {
super();
// TODO Auto-generated constructor stub
}


public int getEid() {
return eid;
}


public void setEid(int eid) {
this.eid = eid;
}


public String getEname() {
return ename;
}


public void setEname(String ename) {
this.ename = ename;
}


public float getEsalary() {
return esalary;
}


public void setEsalary(float esalary) {
this.esalary = esalary;
}


@Override
public String toString() {
return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
}

}


class EmployeeSortId implements Comparator<Employee>{


@Override
public int compare(Employee o1, Employee o2) {
if(o1.getEid()<o2.getEid())
return -1;
else if(o1.getEid()>o2.getEid())
return 1;
else
return 0;
}

}
class EmployeeSortSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o3, Employee o4) {
		// TODO Auto-generated method stub
		if(o3.getEsalary()<o4.getEsalary())
		return -1;
		else if(o3.getEsalary()>o4.getEsalary())
		return 1;
		else
		return 0;
	}
	
}
class EmployeeSortname implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEname().length()<=o2.getEname().length())
			return -1;
		else if(o1.getEname().length()>o2.getEname().length())
			return 1;
		else
		return 0;
	}
	
}
public class TreesetUserdefined {


public static void main(String[] args) {
EmployeeSortId esort1 = new EmployeeSortId();
	EmployeeSortSalary esort2=new EmployeeSortSalary();
	EmployeeSortname esort3=new EmployeeSortname();

Employee e1= new Employee(101,"Pramod",45632);
Employee e2= new Employee(100,"Kiran",55632);
Employee e3= new Employee(99,"Manoj",50632);
Employee e4= new Employee(80,"Sweta",655632);
TreeSet<Employee> temp = new TreeSet<Employee>(esort2);
temp.add(e1);
temp.add(e2);
temp.add(e3);
temp.add(e4);

//System.out.println(temp);
//use Iterator

Iterator<Employee> itemp = temp.iterator();
System.out.println("EID\tEname\tEsalary");
while(itemp.hasNext()) {
Employee e = itemp.next();
System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getEsalary());
}


}


}
