package multithreading;

import java.util.*;

public class MapPractice {
	public static void main(String[] args) {
		Comparator<String> comp=(s1,s2)->{
			return s2.compareTo(s1);
		};
		
		Map <String,String> map=new TreeMap<>(comp);
		map.put("ABCD", "Pune");
		map.put("PQRS", "Pune");
		map.put("ABCD", "Karad");
		map.put("ODRS", "Pune");
		
		System.out.println(map);
		
		Set<String> set=map.keySet();
		Iterator<String> iteratorOfString=set.iterator();
		while(iteratorOfString.hasNext()){
			String key=iteratorOfString.next();
			System.out.println(key+" "+map.get(key));
		}
		
		
		
		
		
	}

}
