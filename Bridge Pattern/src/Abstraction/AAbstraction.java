package Abstraction;

import Implementor.IImplementor;

public abstract class AAbstraction {
    private IImplementor implementor;

    public AAbstraction(){
    }

    public AAbstraction(IImplementor implementor){
        this.implementor = implementor;
    }

    abstract public void show();

    public IImplementor getImplementor(){
        return implementor;
    }
}
