package dp.akash.flyweight_pattern1;

import java.util.HashMap;

/**
 * Created by Akash on 23-Feb-16.
 */
public class ShapeFactory {
    private static final HashMap<String,IShape> circleMap=new HashMap<>();
    public static IShape getCircle(String color){
        Circle circle=(Circle)circleMap.get(color);
        if(circle==null){
            circle=new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
