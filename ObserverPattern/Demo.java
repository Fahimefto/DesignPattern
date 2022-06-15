package ObserverPattern;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
    Subject sub= new Subject();
    new HexObserver(sub);
    new OctObserver(sub);

        Scanner scan =new Scanner(System.in);

        for (int i=0;i<5;i++){
            System.out.println("\nEnter a number : ");
            sub.setState(scan.nextInt());
        }
    }
}
