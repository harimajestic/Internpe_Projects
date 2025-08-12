package Collections;
import java.util.*;
public class iterator {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(123);
	a1.add(true);
	a1.add("prasath");
	for(Object a:a1) {
		System.out.println(a);
	}
	Iterator str=a1.iterator();
	ListIterator str1=a1.listIterator();
	
	
	while(str.hasNext()) {
		System.out.println(str.next());
	}
	while(str1.hasNext()) {
		System.out.println(str1.next());
	}
	while(str1.hasPrevious()) {
		System.out.println(str1.previous());
	}
}
}
