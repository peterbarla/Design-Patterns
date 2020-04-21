package Abstraction;

import Implementor.IImplementor;

public class Dog extends AAbstraction {

    public Dog(IImplementor implementor){
        super(implementor);
    }

    public void show(){
        getImplementor().fighting();
        getImplementor().fighting();
    }
}
