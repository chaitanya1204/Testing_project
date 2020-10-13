package com.demoTesting.Maven.Maven.testingProject;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("TDP");
		
		hs.add("ap");
		
		hs.add("YCP");
		
		hs.add("ts");
		
		hs.add("Congress");
		
		hs.add("tn");
		
		hs.add("Congress");
		
		System.out.println(hs);
		
		System.out.println(hs.remove("tn"));
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
		

	}

}
