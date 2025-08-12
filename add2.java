package Collections;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class add2 {
public static void main(String[] args) {
	Addition a1=(int a ,int b)->{
		return(a+b);
	};
	Addition a2=(int a ,int b)->(a+b);
	System.out.println(a1.add(12, 8));
	System.out.println(a2.add(13, 11));
	checkoddoreven b1=( value)->{
		if(value%2==0) {
			return true;
		}
		else
			return false;
	};
	System.out.println(b1.check(1));
	Printable b2=(message)->System.out.println("Message:"+(message));
	b2.print("Adhiseshan");
	Square b3=(int x)->(x*x);
	System.out.println(b3.square(8));

	Predicate<Integer> p2=(x)->x%2==0;
	System.out.println(p2.test((int)12.5));
	
	Predicate<Double> p=(x)->x%2==0;
	System.out.println(p.test((double)12));
	Predicate <Integer>p1=(x)-> x%2==0;
	System.out.println(p1.test((int) 'b'));
	System.out.println(p1.test(12));
	Function<Integer,String> f=(Int)->Int.toString();
	System.out.println(f.apply(5));
	Function<String,Integer> f1=(str)->str.length();
	System.out.println(f1.apply("adhiseshan"));
	Consumer <String> f2=(str)->{System.out.println(str);};
	f2.accept("hello");
	Supplier<String> s=()->{return "Good afternoon";};
	System.out.println(s.get());

	
}}
