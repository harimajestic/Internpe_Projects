package Collections;

import java.util.*;

public class Emp2 implements Comparable {
	int empid;
	int age;
	String name;
	Emp2(int empid,int age,String name){
		this.empid=empid;
		this.age=age;
		this.name=name;
	}
      @Override
    public int hashCode() {
    	return this.name.charAt(0);
    }
    @Override
    public boolean equals(Object obj) {
    	Emp2 e1=(Emp2)obj;
    	if(this.name.charAt(0)==e1.name.charAt(0)) {
    	return true;
    	}
      return false;
}
 public String toString() {
	   return this.empid+this.name+this.age; 
   }
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Emp2 e=(Emp2)o;
	if ((this.name.charAt(0))<(e.name.charAt(0))) {
		return 1;
	}
	else if(this.name.charAt(0)>(e.name.charAt(0))) {
		return -1;
	}
	else
		return 0;
}

}