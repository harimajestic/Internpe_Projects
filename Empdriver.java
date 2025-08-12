package Collections;

import java.util.*;

public class Empdriver {
public static void main(String[] args) {
	Employee1 e=new Employee1(101,"Ritesh",23);
	Employee1 e1=new Employee1(102,"bharadwaj",21);
	Employee1 e2=new Employee1(100,"Rithik",23);
	Employee1 e3=new Employee1(104,"Raj",19);
	
	HashSet h=new HashSet();
	h.add(e);
	h.add(e1);
	h.add(e2);
	h.add(e3);
	Iterator i1=h.iterator();
	while(i1.hasNext()) {
		Employee1 e4=(Employee1)i1.next();
		System.out.println(e4.name);
	}

}
}
