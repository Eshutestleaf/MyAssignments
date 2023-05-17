package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"Hcl","Wipro","Tcs","Cts","Aspire systems"};
		List<String> nameList=new ArrayList<String>(Arrays.asList(str));
		Collections.sort(nameList);
		System.out.println(nameList);
		List<String> output=new ArrayList<>();
		for(int i=nameList.size()-1;i>=0;i--)
		{
			output.add(nameList.get(i));
		}
		
		System.out.println(output);

	}

}
