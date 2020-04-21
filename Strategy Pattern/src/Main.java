import Strategies.*;

public class Main {
    public static void main(String[] args){
        IFlyStrategie flyStrategie = new NoFlying();
        IQuackStrategie quackStrategie = new SimpleQuacking();
        IDisplayStrategie displayStrategie = new GraphicalDisplaying();

        Duck duck = new Duck(flyStrategie, quackStrategie, displayStrategie);

        duck.fly();
        duck.quack();
        duck.display();
    }
}
