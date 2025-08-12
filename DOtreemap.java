package Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class DOtreemap {
	public static void main(String[] args) {
		Comparator c=new tree();
		Map<Integer,String> map=new TreeMap<>(c);
		map.put(1, "gokul");
		map.put(2, "bharathi");
		map.put(31, "joshwa");
		System.out.println(map);
		}
	}
class tree implements Comparator{
	public int compare(Object o1,Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
		
	}
}