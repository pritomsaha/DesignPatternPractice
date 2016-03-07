package dp.akash.observer_pattern;

/**
 * Created by Akash on 07-Mar-16.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
