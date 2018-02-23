package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnSort {

	public static void main(String[] args) {
		
		List<String> company=new ArrayList<String>();
		company.add("HCL");
		company.add("CTS");
		company.add("Aspire Systems");
		
		System.out.println("Before sorting :"+company);
		
		Collections.sort(company);
		
		System.out.println("After sorting :"+company);

		
		

		

	}

}
