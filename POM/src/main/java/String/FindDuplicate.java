package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) { 
		//Print each character
		
		String str="PayPal India";
		
		for(int i=0;i<str.length();i++){
			System.out.println("Each characters are :"+str.charAt(i));
			
		}
		
		
		
		/*//Print all the duplicate char's
		String str="PayPal India";
		System.out.println("Length of Char :"+str.length());
		//System.out.println("Fifth char of:"+str.charAt(5));
		int count=0; 
		for(int i=0;i<str.length();i++) 
		{ 
			for(int j=i+1;j<str.length();j++) 
			{ 
				if(str.charAt(i)==str.charAt(j)) 
				{ 
					System.out.println("Duplicate character :"+str.charAt(j)); 
					count++;
					//break;
				} 

			} 
		}*/ 
	} 


}

