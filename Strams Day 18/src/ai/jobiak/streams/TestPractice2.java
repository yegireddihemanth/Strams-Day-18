package ai.jobiak.streams;
import java.util.function.*;

import java.util.ArrayList;
import java.util.Collection;

public class TestPractice2 {

	public static void main(String[] args) {
		
		Practice2 emp1 = new Practice2("Y Hemanth Kumar", "121D",54000.00,"Trainee");
		
		Practice2 emp2 = new Practice2("Y Harish Kumar", "131A",60000.00,"Software Engineer");
		
		ArrayList<Practice2>res1 = new ArrayList<>();
		res1.add(emp1);
		res1.add(emp2);
		
		Consumer<Practice2>c1 = (Practice2 p1)->{System.out.println(p1);};
		res1.forEach(c1);
		
		//Practice2 emp3 = new Practice2("Y janaki", "141C",45000.00 "devoleper");
		
		Practice2 emp4 = new Practice2("Y janaki", "141D",60000.00,"Software Engineer");
		res1.add(emp4);
	}

}
