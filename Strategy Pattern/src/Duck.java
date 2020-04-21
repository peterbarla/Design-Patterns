import Strategies.IDisplayStrategie;
import Strategies.IFlyStrategie;
import Strategies.IQuackStrategie;

public class Duck {

    private IFlyStrategie flyStrategie;
    private IQuackStrategie quackStrategie;
    private IDisplayStrategie displayStrategie;

    public Duck(IFlyStrategie flyStrategie, IQuackStrategie quackStrategie, IDisplayStrategie displayStrategie){
        this.flyStrategie = flyStrategie;
        this.quackStrategie = quackStrategie;
        this.displayStrategie = displayStrategie;
    }

    public void fly(){
        flyStrategie.fly();
    }

    public void quack(){
        quackStrategie.quack();
    }

    public void display(){
        displayStrategie.display();
    }
}
