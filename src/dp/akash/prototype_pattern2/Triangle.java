package dp.akash.prototype_pattern2;

/**
 * Created by Akash on 11-Mar-16.
 */
public class Triangle implements IShape{

    private int height,width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public IShape getCopy() {
        Triangle triangle=null;
        try {
            triangle=(Triangle)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return triangle;
    }

    @Override
    public void draw() {
        System.out.println("Triangle is being drawing");
    }
}
