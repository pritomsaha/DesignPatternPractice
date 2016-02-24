package dp.akash.flyweight_pattern1;

/**
 * Created by Akash on 23-Feb-16.
 */
public class FlyweightPatternDemo {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            Circle circle=(Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(getRandomRadius());
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
    private static int getRandomRadius(){
        return (int)(Math.random()*30);
    }

}
