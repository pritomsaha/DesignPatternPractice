package dp.akash.flyweight_pattern2;


/**
 * Created by Akash on 24-Feb-16.
 */
public class Soldier implements ISoldier{
    private Object soldierGraphicalRepresentation;
    @Override
    public void move(int previousLocationX, int previousLocationY , int newLocationX ,int newLocationY) {
        System.out.println("Soldier is moved to "+"("+previousLocationX+","+previousLocationY+")"+" to"
        +"("+newLocationX+","+newLocationY+")");
    }
}
