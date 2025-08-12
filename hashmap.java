package Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
public class hashmap {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(12, "harish");
		h.put(13, "dasan");
		h.put(15, "bharathi");
		h.put(11, "rithesh");
		h.put(10, "rithik");
		h.put(14, "rigree");
		System.out.println(h);
		h.putIfAbsent(9, "arputham");
		h.putIfAbsent(18,"Joshwa");
		h.putIfAbsent(13, "arumugam");
		h.remove(15);
		h.putIfAbsent(15, "raj");
		System.out.println(h.get(13));
		System.out.println(h.getOrDefault(18,"Nothing"));
		System.out.println(h.getOrDefault(19,"Nothing"));
		System.out.println(h.containsKey(14));
		System.out.println(h.containsKey(25));
		System.out.println(h.containsValue("rithesh"));
		System.out.println(h.containsValue("suresh"));
		System.out.println(h);
		Set <Integer>s=h.keySet();
		for(Integer o:s) {
			
			System.out.println(o);
		}
		Collection<String> c=h.values();
		Iterator<String> i=c.iterator();
		while(i.hasNext()) {
			String str=i.next();
			System.out.println(str);
		}
		Set s2=h.entrySet();
		System.out.println(s2);
		for(Entry e:(Set<Entry>)s2) {
			System.out.println(e);
			
		}
	}
	
	

}
