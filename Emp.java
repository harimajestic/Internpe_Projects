package Collections;
public class Emp {
	int id;
	String name;
	int age;
	String dept;
	double sal;
	Emp(int id,String name,int age,String dept,double sal){
		super();
		this.id=id;
		this.name=name;
		this.age=age;
		this.dept=dept;
		this.sal=sal;
		}
  @Override
public String toString() {
	return "id:" +  this.id   + " , "+"name:" + this.name + ","+ "age:" +   this.age +","  +  "dept:"  +   this.dept +","    +   "sal:"   +   this.sal;
}
}
