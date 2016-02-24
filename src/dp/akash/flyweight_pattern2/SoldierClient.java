package dp.akash.flyweight_pattern2;

/**
 * Created by Akash on 24-Feb-16.
 */
public class SoldierClient {
    private ISoldier soldier=SoldierFactory.getSoldier();
    private int currentLocationX = 0;
    private int currentLocationY = 0;

    public void moveSoldier(int newLocationX, int newLocationY){
        soldier.move(currentLocationX, currentLocationY, newLocationX, newLocationY);
        currentLocationX = newLocationX;
        currentLocationY = newLocationY;
    }
    public void showPosition(){
        System.out.println(currentLocationX+" , "+currentLocationY);
    }
}
