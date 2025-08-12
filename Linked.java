package Collections;
import java.util.*;
public class Linked {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(new Student(101,"TVK bharathi",22));
		l.add(new Student(102,"TVK Dasan",23));
		l.add(new Student(103,"bharathi",25));
		Iterator i=l.iterator();
		while(i.hasNext()) {
			Student s=(Student)i.next();
			System.out.println(s);
		}
		
	}

}
