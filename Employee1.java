package Collections;
import java.lang.*;

public class Employee1 implements Comparable{
    int id;
    String name;
    int age;
    Employee1(int id,String name,int age){
    	this.id=id;
    	this.name=name;
    	this.age=age;
    }
    @Override
    public int hashCode() {
    	
    	return this.id;
    }
    @Override
    public boolean equals(Object obj) {
    	Employee1 e=(Employee1)obj;
    	if(this.id==e.id) {
    	return true;
    }
    	return false;
}
    @Override
    public String toString() {
    	
    	return this.id +" ,"+  this.name+ "," +  this.age;
    }
    @Override
    public int compareTo(Object o) {
    	Employee1 e1=( Employee1)o;
    	if(this.age>e1.age) {
    		return 1;
    	}
    	else if(this.age<e1.age){
    	return -1;
    }
    	else
    		return 0;
    }	
}