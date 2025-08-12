package Collections;

public class Student implements Comparable{
	int id;
	String name;
	int age;
	Student(int id,String name,int age){
		this.id=id;
		this.age=age;
		this.name=name;
		
	}
 public boolean equals(Object o) {
		if(this.id==id&& this.name==name&&this.age==age) {
			return true;
		}
		return false;
	}
public String toString() {
	return "id:" + id+""+"age:"+ age+""+"name:"+ name; 
	
}
public int compareTo(Object o) {
	Student s= (Student)o;
	if (this.age>s.age)
	  return 1;
	else if(this.age<s.age)
		return -1;
	else
		return 0;
}
}
