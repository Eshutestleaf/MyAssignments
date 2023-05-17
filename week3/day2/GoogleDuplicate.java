package week3.day2;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class GoogleDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="google";
     char[] character = str.toCharArray();
     
     //Set<Integer>=new LinkedHashSet<>();
     Set<Character> unique = new LinkedHashSet<>();
     for(int i=0;i<character.length;i++)
     {
    	 unique.add(character[i]);
     }
     System.out.println(unique);
	}

}

