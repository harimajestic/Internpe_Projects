package Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stream1 {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(22);
		l.add(25);
		l.add(22);
		l.add(23);
		l.add(27);
		l.add(25);
		Predicate<Integer> p=(val)->val%2!=0 && val<=35;
		List<Integer> odd=l.stream().filter(p).toList();
		System.out.println(odd);
		Function<Integer, Integer> f=(val)->val+10;
		List<Integer> add=l.stream().map(f).toList();
		System.out.println(add);
		//distinct()
		//distinct-->internaly it created Linked hash set
		//set-->unique
		//Linked hashset-->Insertion order maintained
		//overrides equals& hashcode()
		List<Integer>u=l.stream().distinct().toList();
		System.out.println(u);
		//sorted()
		List<Integer>s=l.stream().sorted().toList();
		System.out.println(s);
		//override the comparator in descending order with its square values
		Comparator<Integer> c=(i1,i2)->{
		if(i1>i2)
			return -1;
		else if(i1<i2)
			return 1;
		else
			return 0;
};
			List<Integer>s1=l.stream().sorted(c).toList();
			System.out.println(s1);
			Predicate<Integer> p1=(val)->val<27;
			Function<Integer, Integer> f1=(val)->val*val;
			List<Integer> square=l.stream().filter(p1).map(f1).sorted(c).toList();
			System.out.println(square);
			//min element
			Integer min=l.stream().min(c).get();
			//max element
			Integer max=l.stream().max(c).get();
			System.out.println(min);
			System.out.println(max);
			Consumer<Integer> c1=(val)->System.out.println(val);
			c1.accept(max);
			l.forEach(c1);
			l.forEach(System.out::println);
			//out-->object reference of PrintStream class
			//out-->is a static variable whic is prsent inside system class
			//System.out PrintStream class println() method is present
			}
	

}
