package dp.akash.decorate_pattern;

import java.util.Comparator;

public class Email_comparator implements Comparator<Person>{
	private java.util.Comparator<Person> next_comparator;
	
	public Email_comparator() {
	}
	public Email_comparator(java.util.Comparator<Person> p){
		this.next_comparator=p;
	}
	
	@Override
	public int compare(Person p1, Person p2) {
		int ret=p1.getEmail().compareTo(p2.getEmail());
		if(ret==0){
			if(next_comparator==null)return ret;
			return next_comparator.compare(p1, p2);
		}
		return ret;
	}
}
