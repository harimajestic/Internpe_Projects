package Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Empd {
	public static void main(String[] args) {
		ArrayList<Emp> l=new ArrayList<Emp>();
		l.add(new Emp(101,"john",25,"Development",25000));
		l.add(new Emp(102,"joshwa",26,"Devops",50000));
		l.add(new Emp(102,"joshwa",22,"Devops",30000));
		l.add(new Emp(103,"ramu",23,"Testing",19000));
		l.add(new Emp(106,"sudha",22,"Testing",18000));
		l.add(new Emp(104,"smartraj",50,"Development",52000));
		l.add(new Emp(105,"sogo",43,"Devops",55000));
		Predicate<Emp> p=(e)->e.sal>=20000 && e.age <40 && e.dept=="Devops";
		Predicate<Emp> p2=(e)->e.sal>50000 && e.age >30;
		List<Emp> j=l.stream().filter(p).toList();
		System.out.println(j);
		System.out.println("==============================");
		List<Emp> j1=l.stream().filter(p2).toList();
		System.out.println(j1);
		System.out.println("==============================");
		//update sal by 30%
		Predicate<Emp>p3=(e)->e.age>30;
		Function<Emp,Emp> f=(e)->{
			e.sal=e.sal+(e.sal*0.3);
			return e;
		};
		List<Emp> j2=l.stream().filter(p3).map(f).toList();
		System.out.println(j2);
		System.out.println("==============================");
		//update sal by 15%
		Predicate<Emp> p4=(e)->e.sal<20000 && e.age <25 && e.dept=="Testing";
		Function<Emp,Emp> f1=(e)->{
			e.sal=e.sal+(e.sal*0.15);
			return e;
		};
		List<Emp> j3=l.stream().filter(p4).map(f1).toList();
		System.out.println(j3);
		System.out.println("======================================");
		//sorting done by sal using comparator
	   Comparator<Emp> c=(sal1,sal2)->{
		   if(sal1.sal <sal2.sal)
			   return -1;
		   else if(sal1.sal>sal2.sal)
			   return 1; 
		   else
			   return 0;
		   };
	  List<Emp> j4=l.stream().sorted(c).toList();
	  System.out.println(j4);
	  System.out.println("======================================");
	  //sorting done by age using comparator
	  Comparator<Emp> c1=(age1,age2)->{
		   if(age1.age <age2.age)
			   return -1;
		   else if(age1.age>age2.age)
			   return 1; 
		   else
			   return 0;
		   };
	  List<Emp> j5=l.stream().sorted(c).toList();
	  System.out.println(j5);
	  System.out.println("=============================");
	  //increase the age of every person by one year
	  //print those emp who have age >25
	  Function<Emp,Emp> f2=(e)->{
			e.age=e.age+1;
			return e;
       };
		Predicate<Emp> p5=(e)-> e.age >25;
		List<Emp> j6=l.stream().filter(p5).map(f2).toList();
		System.out.println(j6);
		System.out.println("===============================");
		long j7=l.stream().filter(p5).map(f2).count();
		System.out.println(j7);
	}
	
}
