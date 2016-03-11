package dp.akash.prototype_pattern1;

public class PrototypePatternDemo {
	   public static void main(String[] args) {
	      ShapeCache.loadCache();

	      Shape clonedShape = ShapeCache.getShape("1");
	      System.out.println("IShape : " + clonedShape.getType());

	      Shape clonedShape2 = ShapeCache.getShape("2");
	      System.out.println("IShape : " + clonedShape2.getType());

	      Shape clonedShape3 = ShapeCache.getShape("3");
	      System.out.println("IShape : " + clonedShape3.getType());
	   }
}