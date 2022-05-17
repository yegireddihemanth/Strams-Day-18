 package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.function.*;

public class ConsumerTesting {

	public static void main(String[] args) {
		
		
		ArrayList<String>list1 = new ArrayList<>();
		
		list1.add("element 1");
		list1.add("element 2");list1.add("element 3");
		list1.add("element 4");list1.add("element 5");
		System.out.println(list1);
		
		Consumer<String>con1 = (String str)->{System.out.println(str);};
		list1.add("element 6");	
		list1.forEach(con1);
		ArrayList<Integer>integers = new ArrayList<>();
		integers.add(1); integers.add(2); integers.add(3); integers.add(4);
		
		Consumer<Integer> values = (Integer i)->{System.out.println(i);};
		integers.forEach(values);
		
		
		
		
		//list1.forEach(list1);
		

	}

}
