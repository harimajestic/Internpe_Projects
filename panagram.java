package DSAproblems;

import java.util.HashSet;

public class panagram {
public static void main(String[ ]args) {
	String s="hello";
	s=s.toLowerCase();
	HashSet<Character>hs=new HashSet<Character>();
	for(char ch:s.toCharArray()) {
		if(ch>='a'&&ch<='z'&& hs.size()==26) {
			hs.add(ch);		
			}
	}System.out.println("panagram");
	}
}
