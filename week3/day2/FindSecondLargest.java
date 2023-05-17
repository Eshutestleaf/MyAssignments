package week3.day2;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> large=new TreeSet<>();
		for(int i=0;i<data.length;i++)
		{
			large.add(data[i]);
		}
		System.out.println(large);
		List<Integer> list=new ArrayList<>(large);
		int value=list.size()-2;
		System.out.println("second largest number is " +list.get(value));
		System.out.println("Size of list is " +list.size());
		
		
		
	}
	}