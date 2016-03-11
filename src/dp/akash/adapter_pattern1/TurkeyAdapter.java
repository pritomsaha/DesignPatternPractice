package dp.akash.adapter_pattern1;

/**
 * Created by Akash on 10-Mar-16.
 */
public class TurkeyAdapter implements Duck{
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey=turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0;i<5;i++)turkey.fly();
    }
}
