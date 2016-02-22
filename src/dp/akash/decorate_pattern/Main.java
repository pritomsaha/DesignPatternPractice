package dp.akash.decorate_pattern;

import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args){
		FileReader f=new FileReader();
		List<Person> persons=f.get_person_List("input.txt");
		Collections.sort(persons,new Age_comparator(new Name_comparator(new Email_comparator())));
		for (Person person : persons) {
			person.print_info();
		}
	}
		
}
