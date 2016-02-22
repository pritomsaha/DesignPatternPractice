package dp.akash.composite_pattern;

public class House extends Shape{
	
	private int roofHeiht,x1,y1,x2,y2;
	
	public House(int x1,int y1,int x2,int y2,int rh){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		this.roofHeiht=rh;
	}

	@Override
	public void buildShape() {
		shapes.add(new Rectangle(x1, y1, x2, y2));
		shapes.add(new Rectangle(x1+25, y1, x2-25, y2+10));
		shapes.add(new Triangle(x1, y2, x2, y2, x1+(x2-x1)/2, y2-roofHeiht));
	}
}
