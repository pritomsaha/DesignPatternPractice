package dp.akash.decorate_pattern;

public class Person {
	
	private String name;
	private Double age;
	private String email;
	
	public Person(String name,Double age, String email) {
		this.name=name;
		this.age=age;
		this.email=email;
	}
	
	public void print_info(){
		System.out.println(name+" "+age+" "+email);
	}
	public String getName() {
		return name;
	}
	public Double getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	
}
