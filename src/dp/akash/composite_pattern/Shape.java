package dp.akash.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape implements IShape{
	protected List<IShape> shapes=new ArrayList<>();
	public abstract void buildShape();
	public void draw(){
		buildShape();
		for (IShape shape : shapes) {
			shape.draw();
		}
	}
}
