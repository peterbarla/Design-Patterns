import Abstraction.AAbstraction;
import Abstraction.Cat;
import Abstraction.Dog;
import Implementor.Brave;
import Implementor.IImplementor;
import Implementor.Scared;

public class Main {
    public static void main(String[] args){
        IImplementor implementor = new Scared();
        IImplementor implementor2 = new Brave();
        AAbstraction dog = new Dog(implementor);
        dog.show();
        AAbstraction cat = new Cat(implementor2);
        cat.show();
    }
}
