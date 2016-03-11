package dp.akash.prototype_pattern2;

/**
 * Created by Akash on 11-Mar-16.
 */
public class Circle implements IShape{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public IShape getCopy() {
        Circle circle=null;
        try {
            circle=(Circle)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return circle;
    }

    @Override
    public void draw() {
        System.out.println("Circle is being drawing");
    }
}
