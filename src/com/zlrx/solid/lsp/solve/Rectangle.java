package com.zlrx.solid.lsp.solve;

public class Rectangle implements Shape {

    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int area() {
        return height * width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
