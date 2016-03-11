package dp.akash.prototype_pattern2;

/**
 * Created by Akash on 11-Mar-16.
 */
public class Main {
    public static void main(String[] args){
        Circle circle1=new Circle();
        circle1.setRadius(10);
        System.out.println(circle1.getRadius());
        Circle circle2=(Circle)circle1.getCopy();
        System.out.println(circle2.getRadius());
        circle2.setRadius(20);
        System.out.println(circle2.getRadius());
        System.out.println(circle1.getRadius());
    }
}
