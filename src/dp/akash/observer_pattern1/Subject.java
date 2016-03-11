package dp.akash.observer_pattern1;

import java.util.ArrayList;

/**
 * Created by Akash on 07-Mar-16.
 */
public class Subject {
    private int state=0;
    private ArrayList<Observer>observers=new ArrayList<>();

    public void attach(Observer observer){
        this.observers.add(observer);
    }

    public void setState(int state) {
        this.state = state;
        _notify();
    }

    public int getState() {
        return state;
    }

    private void _notify(){
        for (Observer observer:observers){
            observer.update();
        }
    }
}
