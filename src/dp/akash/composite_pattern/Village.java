package dp.akash.composite_pattern;

import java.util.*;

public class Village extends Shape{

	private List<House> houses=new ArrayList<House>();
	private List<Tree> trees=new ArrayList<Tree>();
	private River river;
	
	public Village(List<House> houses,List<Tree> trees,River river){
		this.houses=houses;
		this.trees=trees;
		this.river=river;
	}

	@Override
	public void buildShape() {
		for (House house : houses) {
			shapes.add(house);
		}
		for(Tree tree:trees){
			shapes.add(tree);
		}
		shapes.add(river);
	}
}
