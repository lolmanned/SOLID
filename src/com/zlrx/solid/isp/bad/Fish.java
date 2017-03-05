package com.zlrx.solid.isp.bad;

public class Fish implements Animal {
    @Override
    public void setName() {
        //implementáció
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void swim() {
        //implementáció
    }
}
