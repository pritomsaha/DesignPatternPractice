package dp.akash.singleton_pattern;

/**
 * Created by Akash on 23-Feb-16.
 */
public class Singleton {
    private static Singleton instance;
    private int count=0;
    private Singleton(){
        System.out.println("Singleton(): Initializing Instance");
    }
    public static Singleton getInstance(){
        if(instance==null){
            System.out.println("getInstance(): First time getInstance was invoked!");
            instance=new Singleton();
        }
        return instance;
    }
    public void increaseCount(){
        count+=1;
    }
    public void printCount(){
        System.out.println(count);
    }
}
