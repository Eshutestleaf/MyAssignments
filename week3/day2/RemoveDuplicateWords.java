package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] strings = text.split(" ");
		System.out.println(Arrays.toString(strings));
		Set<String> Duplicate=new TreeSet<>();
		for(int i=0;i<strings.length;i++)
		{
			Duplicate.add(strings[i]);
			
		}
		List<String> result=new ArrayList<>(Duplicate);
		System.out.println(result);
        //System.out.print(Duplicate);
	}

}
