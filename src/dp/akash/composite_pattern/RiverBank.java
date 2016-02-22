package dp.akash.composite_pattern;

public class RiverBank extends Shape{

	private int x1,y1,x2,y2,x3,y3;
	
	public RiverBank(int x1,int y1,int x2,int y2,int x3,int y3) {
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.y1=y1;
		this.y2=y2;
		this.y3=y3;
	}
	@Override
	public void buildShape() {
		shapes.add(new Line(x1, y1, x2, y2));
		shapes.add(new Line(x2, y2, x2, y2+60));
		shapes.add(new Line(x2, y2+60, x3, y3));	
	}
}
