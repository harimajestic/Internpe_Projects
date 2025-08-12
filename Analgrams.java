package Collections;
import java.util.HashMap;
import java.util.Map;
public class Analgrams {
public static void main(String[] args) {
	      String s="aaabbccaddb";
	      Map<Character,Integer>m=new HashMap<>();
	      for(char ch:s.toCharArray()) {
	    	  m.put(ch,m.getOrDefault(ch,0)+1);
	    	  }
	      System.out.println(m);
	      }
}
