package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] number= {9,2,3,5,5,6,1,7,9,10,10,5,2,11,13,100};
     Set<Integer> missing=new TreeSet<>();
     for(int i=0;i<number.length;i++)
     {
    	 missing.add(number[i]);
     }
     //Collections.sort(missing);
     System.out.println(missing);
     List<Integer> num = new ArrayList<>(missing);
     System.out.println(num.size());
     int stNum, EndNum;
     stNum = num.get(0);
     EndNum = num.get(num.size() - 1);
     
      while (stNum < EndNum) 
      {
    	  stNum += 1; 
    	    
    	 if (!missing.contains(stNum)){
    		 missing.add(stNum);
    	 }
      }
     
   
     
     
     System.out.println(missing);
}
}
