package com.zlrx.solid.isp.bad;

public class Bird implements Animal {

    @Override
    public void setName() {
        //implementáció
    }

    @Override
    public void walk() {
        //implementáció
    }

    @Override
    public void fly() {
        //implementáció
    }

    @Override
    public void swim() {
        throw new UnsupportedOperationException();
    }
}
