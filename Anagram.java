package DSAproblems;

import java.util.HashMap;

public class Anagram {
	
public static boolean hari(String s1,String s2) {
	HashMap<Character,Integer>h=new HashMap<Character,Integer>();
	 char[]c1=s1.toCharArray();
	 char[]c2=s2.toCharArray();
	 for(char ch :s1.toCharArray()) {
	  h.put(ch, h.getOrDefault(ch,0)+1);	 
		 
	 }
	 for(char ch:c2) {
		 if(!h.containsKey(ch))return false;
		 
		h.put(ch, h.get(ch)-1);
		if(h.get(ch)<0)return false; 
	 }
return true;
}
	
public static void main(String[] args) {
	String s1="Act";
	String s2="cat";
	Anagram.hari("Act", "cat");
	 
}
}

