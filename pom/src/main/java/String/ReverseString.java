package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {

		String input="Amazon";

		/*StringBuilder input1=new StringBuilder();
		 
		// append a string into StringBuilder input1
		input1.append(input);

		 // reverse StringBuilder input1
		input1=input1.reverse();

		for(int i=0; i<input1.length();i++){
			System.out.println(input1.charAt(i));
		}*/
		// convert String to character array
        // by using toCharArray
		/*char[] input1=input.toCharArray();
		
		for(int i=input1.length-1;i>=0;i--){
			System.out.println(input1[i]);
		}*/
		
		char[] a1=input.toCharArray();
		List<Character> each=new ArrayList<Character>();
		
		for(char b:a1){
			each.add(b);
		}
		Collections.reverse(each);
		System.out.println(each);
		


	}

}
