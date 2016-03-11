package dp.akash.adapter_pattern1;

import java.util.Random;

/**
 * Created by Akash on 10-Mar-16.
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    Random random;
    public DuckAdapter(Duck duck){
        this.duck=duck;
        random=new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if(random.nextInt()==0)duck.fly();
    }
}
