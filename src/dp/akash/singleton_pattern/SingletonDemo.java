package dp.akash.singleton_pattern;

/**
 * Created by Akash on 23-Feb-16.
 */
public class SingletonDemo {

    public static void main(String[] args){
        Singleton singleton1=Singleton.getInstance();
        singleton1.printCount();
        Singleton singleton2=Singleton.getInstance();
        singleton2.increaseCount();
        singleton1.printCount();
        singleton1.increaseCount();
        singleton2.printCount();
    }
}
