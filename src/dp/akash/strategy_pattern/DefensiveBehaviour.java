package dp.akash.strategy_pattern;

public class DefensiveBehaviour implements IBehaviour{

	@Override
	public void moveCommand() {
		System.out.println("Robot is moving defensively");
	}

}
