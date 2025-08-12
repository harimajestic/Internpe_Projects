package Collections;

import java.util.function.Function;
import java.util.function.Predicate;

public class Driver1 {
	public static void m1(Employe e) {
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.dep);
		e.kill();
	}

	public static void m2(int x, Predicate p) {// ->in this code it is higher order function
		System.out.println(p.test((int) 2.2));
	}

	public static void m3(String str, Predicate p1) {
		System.out.println(p1.test("helloqqq"));
	}
	public static void m4(int x,Function<Integer,Integer> f) {
		System.out.println(f.apply(x));
	}
	public static void m5(String str,Function<String,Integer> f1) {
		System.out.println(f1.apply(str));
	}
	public static void main(String[] args) {
		Employe e = new Employe(101, "akash p", "AI&DS");
		m1(e);
		Predicate<Integer> p = (x) -> x % 2 == 0;
		System.out.println(p.test(11));
		m2(2, p);
		Predicate<String> p1 = (str) -> str.length() > 5;
		m3("hello", p1);
		Function<Integer,Integer>f=(val)->val*val;
		m4(12,f);
		m4(13,f);
		m4(14,f);
		Function <String,Integer> f1 = (str) -> str.length();
		m5("aravinth",f1);
		m5("akash",f1);
		
		}
}
