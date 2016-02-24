package dp.akash.flyweight_pattern2;

/**
 * Created by Akash on 24-Feb-16.
 */
public class SoldierFactory {

    private static ISoldier soldier;
    public static ISoldier getSoldier(){
        if(soldier==null){
            System.out.println("soldier now created");
            soldier=new Soldier();
        }
        return soldier;
    }
}
