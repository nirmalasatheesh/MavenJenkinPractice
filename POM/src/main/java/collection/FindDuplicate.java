package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) { 
		
	//Count the duplicate char's
	String word="Amazon India";
		char[] ch=word.toCharArray();

		int count=0;
		Set<Character> bt=new HashSet<Character>();
		for(Character bc:ch){
			if(bt.add(bc)==false){	
				int occurence=Collections.frequency(bt, bc);
				count+=occurence;

				if (count>1) {
					System.out.println(bc);
				}
				else{
					System.out.println(bc);
				}
			}

		}
		System.out.println("No of occurance :"+count);

	}
	 
}

