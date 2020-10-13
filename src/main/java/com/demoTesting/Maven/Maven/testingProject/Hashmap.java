package com.demoTesting.Maven.Maven.testingProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(0, "Hello");
		
		hm.put(1, "Hai");
		
		hm.put(2, "How");
		
		hm.put(3, "Are");
		
		hm.put(4, "You");
		
		System.out.println(hm.get(0));
		
		hm.remove(1);
		
		System.out.println(hm.get(1));
		
		Set s = hm.entrySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry mp = (Map.Entry)it.next();
			
			System.out.println(mp.getKey());
			
			System.out.println(mp.getValue());
			
		}
		
		

	}

}
