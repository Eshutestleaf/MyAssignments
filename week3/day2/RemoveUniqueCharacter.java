package week3.day2;

import java.util.HashSet;

public class RemoveUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="saneshukaashuaadhu";
		char[] chr = str.toCharArray();
		HashSet<Character> unique=new HashSet<>();
		for(int i=0;i<chr.length;i++)
		{
			unique.add(chr[i]);
		}
	    
       System.out.println(unique);
	}

}
