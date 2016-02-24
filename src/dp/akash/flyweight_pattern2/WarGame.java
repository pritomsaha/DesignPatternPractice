package dp.akash.flyweight_pattern2;

/**
 * Created by Akash on 24-Feb-16.
 */
public class WarGame {
    public static void main(String[] args){
        SoldierClient warSoldiers [] ={
                new SoldierClient(),
                new SoldierClient(),
                new SoldierClient(),
                new SoldierClient(),
                new SoldierClient()
        };
        warSoldiers[0].moveSoldier(17, 2112);
        warSoldiers[1].moveSoldier(137, 112);
        warSoldiers[2].moveSoldier(137, 112);
        warSoldiers[0].showPosition();
        warSoldiers[1].showPosition();
    }
}
