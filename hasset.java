package Collections;
import java.util.*;

public class hasset {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		
		System.out.println(h.add(new Emp2(105,26,"Sam")));
		h.add(new Emp2(104,31,"sOurav"));
		h.add(new Emp2(101,23,"Raja"));
		h.add(new Emp2(102,22,"ram"));
		System.out.println(h);
		Iterator i=h.iterator();
		while(i.hasNext()) {
			Emp2 e=(Emp2)i.next();
			System.out.println(e.name);
		}

	}
	

}
