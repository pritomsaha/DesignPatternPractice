package dp.akash.decorate_pattern;

import java.util.Comparator;

public class Age_comparator implements Comparator<Person>{
	private java.util.Comparator<Person> next_comparator;
	
	public Age_comparator(){
		
	}
	public Age_comparator(java.util.Comparator<Person> p){
		this.next_comparator=p;
	}
	@Override
	public int compare(Person p1, Person p2) {
		if(p1.getAge()>p2.getAge())return 1;
		else if(p1.getAge()<p2.getAge())return -1;
		else{
			if(next_comparator==null)return 0;
			return next_comparator.compare(p1, p2);
		}
	}
}
