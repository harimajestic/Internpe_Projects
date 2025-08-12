package Collections;
import java.io.Serializable;
public class Emp1 implements Serializable {
  int empid;
  String name;
  String dept;
  transient String password;
public Emp1(int empid,String name,String dept,String password){
	this.empid=empid;
	this.name=name;
	this.dept=dept;
	this.password=password;
	}
@Override
public String toString() {
	return "empid=" + empid + ", name=" + name + ", dept=" + dept+" "+password; 
}

}
