package Collections;

public class Salarydetails{
     int salary;
     String employee;
     int deptid;
     Salarydetails(int salary,String employee,int deptid){
    	 this.salary=salary;
    	 this.employee=employee;
    	 this.deptid=deptid;
     }
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "salary:"+ salary +"employee:"+ employee +"deptid:"+ deptid;
    }
}
