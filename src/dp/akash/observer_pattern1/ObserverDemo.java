package dp.akash.observer_pattern1;

import java.util.Scanner;

/**
 * Created by Akash on 07-Mar-16.
 */
public class ObserverDemo {

    public static void main(String[] args){
        Subject subject=new Subject();
        new HexObserver(subject);
        new OctObserver(subject);
        new BinObserver(subject);
        Scanner scan=new Scanner(System.in);
        while (true) {
            System.out.print( "\nEnter a number: " );
            subject.setState( scan.nextInt() );
        }
    }
}
