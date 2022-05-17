package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class CreatingStream {

	//private CreatingStream ;

	public static void main(String[] args) {
		ArrayList<String>emp = new ArrayList<>();
		emp.add("hello welcome to java 8");
		emp.add("we are going to learn about streams");
		emp.add("we  are going to learn about streams");
		
		//System.out.println(emp);
		
		Consumer<String>str = (s)->{System.out.println(s);};
		emp.forEach(str);
		
		Function<String,Integer>str2=(String s)->{return s.length();};
		Integer in=str2.apply(emp.get(1));
		System.out.println(in);
		
		/*
		 * Function<Integer, Integer>int1 = (Integer i)->{return i.intValue();}; Integer
		 * res2 = int1.apply(12345); System.out.println("res2 "+res2);
		 */
		
		//char[] res3=res2.toCharArray();
		//System.out.println(res3);
		Consumer<String>chars = (String c)->{System.out.println(c);};
		 
		emp.forEach(chars);
		List<String>list1=emp.stream().filter(s1->(s1.contains("8"))).collect(Collectors.toList());
		System.out.println("Which contains 8 "+list1);
		
		//Predictate<String>list3 = (String p2)->{return (p2.charAt(0)=='h');};
		
		emp.stream().forEach(System.out::println);
		List<String> st= emp.stream().map(l->(l.toUpperCase())).collect(Collectors.toList());
		System.out.println(st);
		st.forEach(str);
		emp.stream().distinct().forEach(System.out::println);
		//List<String>hola=emp.stream().map(f->(f.toUpperCase()).collect(Collectors.toList()));
		
		
		
		}
}

	


