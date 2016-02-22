package dp.akash.strategic_pattern;

public class Robot {
	private IBehaviour behaviour;
	private String name;
	
	public Robot(String name){
		this.setName(name);
		behaviour=new NormalBehaviour();
	}
	public void setBehaviour(IBehaviour behaviour){
		this.behaviour=behaviour;
	}
	public IBehaviour getBehaviour(){
		return this.behaviour;
	}
	public void move(){
		behaviour.moveCommand();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
