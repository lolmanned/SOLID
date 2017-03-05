package com.zlrx.solid.lsp.solve;

public class Square implements Shape {

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int area() {
        return side * side;
    }
}
