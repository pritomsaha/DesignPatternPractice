package dp.akash.strategy_pattern;

public class Main {
	
	public static void main(String[] args){
		Robot robot_1=new Robot("Kabbya");
		Robot robot_2=new Robot("Barno");
		robot_1.move();
		robot_2.setBehaviour(new DefensiveBehaviour());
		robot_2.move();
		
	}

}
