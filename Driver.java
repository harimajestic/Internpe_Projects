package Collections;
import java.util.ArrayList;
import java.util.*;

public class Driver {
public static void main(String[] args) {
  	ArrayList a= new ArrayList();
	a.add(new Student(101,"raj",20));
	a.add(new Student(102,"som",21));
	a.add(new Student(103,"hari",22));
	a.add(new Student(104,"bharathi",25));
	a.add(new Student(105,"subu",23));
	Student s= new Student(101,"raj",20);
	System.out.println(a.contains(s));
	a.remove(s);
	for(Object o:a) {
		Student s1=(Student)o;
		System.out.println(s1.name);
		
	}
	Iterator i=a.iterator();
	int search=101;
	while(i.hasNext()) {
		Student s1=(Student)i.next();
		if(s1.id==search) {
			i.remove();
		}
		
	}
	System.out.println(a);
	Iterator i1=a.iterator();
	while(i1.hasNext()) {
		Student s2=(Student)i1.next();
		if(s2.age<=22) {
			System.out.println(s2.name);
		}
		
	}
	
	
	
	
}
}
