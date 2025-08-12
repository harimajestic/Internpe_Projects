package Encapsulation;
import java.util.Scanner;
public class stringreverse {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string");
		String a = s.nextLine();
		String []b= a.split("");
		int i=0;
		int j=b.length-1;
		while(i<j) {
			String temp=b[i];
			b[i]=b[j];
			b[j]=temp;
			i++;
			j--;
		}
		String newstring=String.join("",b);
		System.out.println(newstring);
		

	}

}
