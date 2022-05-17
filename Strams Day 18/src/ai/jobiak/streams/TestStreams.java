package ai.jobiak.streams;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class TestStreams {

	public static void main(String[] args) {
		
		
ArrayList<String>list= new ArrayList<>();
list.add("Hello welcome");
list.add("how are you");
list.add("hemanth");

//list.stream().forEach(System.out::println);
//list.stream().allMatch("hello");

Consumer<String>consumer = (String str) ->{System.out.println(str);};
list.forEach(consumer);

List<String>listB = list.stream().filter(e->(e.charAt(0)=='h')).collect(Collectors.toList());

System.out.println(listB);
Predicate<String>Testb = (String str)->{return (str.charAt(0)=='h');};
listB = list.stream().filter(Testb).collect(Collectors.toList());
System.out.println(listB);

//Function<Sting,String>listF=list.stream().map()

Predicate<String>Testb1 = (String str)->{return (str.startsWith("Hello"));};
listB = list.stream().filter(Testb1).collect(Collectors.toList());
System.out.println("starts with Hello "+listB);



	}

	
	
	
	


}
