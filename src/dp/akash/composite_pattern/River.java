package dp.akash.composite_pattern;

public class River extends Shape{
	
	private int x1,y1,x2,y2,x3,y3;
	public River(int x1,int y1,int x2,int y2,int x3,int y3) {
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.y1=y1;
		this.y2=y2;
		this.y3=y3;
	}
	@Override
	public void buildShape() {
		
		shapes.add(new RiverBank(x1, y1, x2, y2, x3, y3));
		shapes.add(new RiverBank(x1, y1+60, x2-60, y2+85, x3, y3+60));
	}
}
