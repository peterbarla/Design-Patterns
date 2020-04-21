package Abstraction;

import Implementor.IImplementor;

public class Cat extends AAbstraction {

    public Cat(IImplementor implementor){
        super(implementor);
    }

    public void show(){
        getImplementor().fighting();
        getImplementor().fighting();
    }
}
