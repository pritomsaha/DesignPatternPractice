package dp.akash.adapter_pattern1;

/**
 * Created by Akash on 10-Mar-16.
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
