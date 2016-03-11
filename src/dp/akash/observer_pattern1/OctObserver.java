package dp.akash.observer_pattern1;

/**
 * Created by Akash on 07-Mar-16.
 */
public class OctObserver extends Observer{

    public OctObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.print( " " + Integer.toOctalString( subject.getState() ) );
    }
}
