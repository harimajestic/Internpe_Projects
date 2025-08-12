package Collections;
import java.util.*;

public class Generic {
	public static void main(String[] args) {
		ArrayList<Double> a1=new ArrayList();
		a1.add((double) 22);
		ArrayList<Integer> b1=new ArrayList();
		b1.add((int)22.5);
		b1.add(34);
		b1.add(3);
		ArrayList<Boolean>c=new ArrayList();
		c.add(true);
		ArrayList<String>d=new ArrayList();
		d.add(""+28);
		System.out.println(d);
		System.out.println(a1);
		System.out.println(b1);
	}
}
