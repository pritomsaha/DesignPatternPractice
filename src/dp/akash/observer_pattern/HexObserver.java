package dp.akash.observer_pattern;

/**
 * Created by Akash on 07-Mar-16.
 */
public class HexObserver extends Observer{

    public HexObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.print( " " + Integer.toHexString( subject.getState() ) );
    }

}
