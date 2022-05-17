package ai.jobiak.streams;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashmapEmployee {

	public static void main(String[] args) {
		Map<String,Double>salaries = new HashMap<>();
		
		salaries.put("hemanth", 40000.00);
		salaries.put("Anish", (double) 700000);
		salaries.put("franeeth", 40000.00);
		salaries.put("faramesh", 5000.00);
		salaries.put("surendra", 50000.00);
		
		
	ArrayList<String>list1 = new ArrayList<>();
		
		list1.add("element 1");
		list1.add("element 2");list1.add("element 3");list1.add("element 4");list1.add("element 5");
		
		
		
		Consumer<String>sal=(String i)->{System.out.println(i);};
	list1.forEach(sal);
	System.out.println(salaries);
	//Function<String,Integer>sal2 = (String j )->{return j.valueOf("hemanth");};
	salaries.replace("hemanth", 50000.00);
	System.out.println(salaries);
	List<String> l=list1.stream().map(
			i->(i.toUpperCase()))
			.collect(Collectors.toList());
	System.out.println(l);	
	
	
		

	}

}
