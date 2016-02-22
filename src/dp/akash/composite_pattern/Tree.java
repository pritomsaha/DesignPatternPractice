package dp.akash.composite_pattern;

public class Tree extends Shape{

	public int x , y , height;

	public Tree(int x, int y, int height) {
		this.x = x;
		this.y = y;
		this.height = height;
	}

	@Override
	public void buildShape() {
		shapes.add(new Line(x, y , x, y-height));
		shapes.add(new Line(x-10 , y-height-10 , x+10 , y-height+10));
		shapes.add(new Line(x-10 , y-height+10 , x+10 , y-height-10));
	}
}
