package Collections;
import java.util.*;
public class Student1 {
public static void main(String[] args) {
	String s1="Listen";
	String s2="silent";
	char[]ar=s1.toLowerCase().toCharArray();
	char[]arr=s2.toLowerCase().toCharArray();
	Arrays.sort(ar);
	Arrays.sort(arr);
	System.out.println(Arrays.equals(ar,arr));
	ArrayList l= new ArrayList();
	System.out.println("--------------------------------");
	String[] str= {"eat","tea","tan","ate","nat","bat"};
	Map<String,List<String>>s=new HashMap<>();
	for(String str1:str) {
		char[] a=str1.toCharArray();
		Arrays.sort(a);
		String str2=new String(a);
//        s.computeIfAbsent(str2,k->new ArrayList<>()).add(str1);
		if(!s.containsKey(str2)) {
			s.put(str2,new ArrayList());
			s.get(str2).add(str1);
		}
		else {
			s.get(str2).add(str1);		}
		}
	for(Map.Entry<String,List<String>>entry:s.entrySet()) {
		
		System.out.println(entry.getValue());
	}
}
}