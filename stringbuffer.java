package Encapsulation;
import java.util.Scanner;
public class stringbuffer {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Ritesh");
		System.out.println(sb);
		sb.append("Trainer");
		System.out.println(sb);
		//insert()
		sb.insert(6, " Java ");
		System.out.println(sb);
		//delete()->start,end-1
		sb.delete(6, 11);
		System.out.println(sb);
		//setcharAt()
		sb.setCharAt(6, '-');
		System.out.println(sb);
		//sb.reverse()
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
        Scanner s= new Scanner(System.in);
        System.out.println("enter a string");
	    String a=s.nextLine();
	    StringBuffer b1=new StringBuffer(a);
	    b1.reverse();
	    
	    String rev = new String(b1);
	    System.out.println(rev);
	
	}

}
