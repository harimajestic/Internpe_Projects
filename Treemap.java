package Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		TreeMap <EmployeeKeys,Salarydetails>t=new TreeMap<EmployeeKeys,Salarydetails>();
	     t.put(new EmployeeKeys(101,"IT"),new Salarydetails(1000, "rahul" ,1));
	     t.put(new EmployeeKeys(102,"AI&DS"),new Salarydetails(2000, "raj" ,20));
	     t.put(new EmployeeKeys(114,"AI&DS"),new Salarydetails(2000,"raj",5));
	     t.put(new EmployeeKeys(106,"cse"),new Salarydetails(40000,"joshwa",3));
	     t.put(new EmployeeKeys(103,"AI&DS"),new Salarydetails(2000,"raj",2));
	     Set<Map.Entry<EmployeeKeys,Salarydetails>> s=t.entrySet();
	     for(Map.Entry<EmployeeKeys, Salarydetails> e:s){
	    	 System.out.println(e);
	     }
	     Iterator<Map.Entry<EmployeeKeys, Salarydetails>> i=s.iterator();
	     while(i.hasNext()){
	    	 System.out.println(i.next());
	     }
	     }


}
