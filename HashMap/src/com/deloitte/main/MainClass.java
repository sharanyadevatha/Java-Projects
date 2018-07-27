package com.deloitte.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		HashMap<Integer, String> result = new HashMap<Integer, String>();
		
		
		result.put(112, "DEF");
		result.put(113, "GHI");
		result.put(114, "JKL");
		result.put(115, "MNO");
		result.put(116, "PQR");
		
		System.out.println(result.get(114));
		System.out.println(result.size());
		System.out.println(result.values());
		Set<Integer> keys = result.keySet();
		
		for(Integer key : keys) {
			System.out.println("Key: "+key +"  Value: "+result.get(key));
		}
		
		Iterator<Integer> iterator = keys.iterator();
		Integer key;
		while (iterator.hasNext()){
			key = iterator.next();
			System.out.println(key+"-"+result.get(key));
			
		}
		
	}

}
