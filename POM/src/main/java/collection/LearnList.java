package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		List<String> names=new ArrayList<String>();

		names.add("raju");
		names.add("Avinash");
		names.add("Kannan");
		names.add("Bavi");
		names.add("Selva");
		

		System.out.println("Total name size :"+names.size());

		for(String name:names){
			System.out.println(name);
		}
		
		names.remove("Kannan");
		
		System.out.println("After removal :"+names.contains("Kannan"));
		
		Collections.sort(names);
		
		for(String name:names){
			System.out.println(name);
			
		}
		names.clear();
		System.out.println("List is empty :"+names.isEmpty());

	}
}


