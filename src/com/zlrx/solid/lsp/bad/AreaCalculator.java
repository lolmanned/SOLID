package com.zlrx.solid.lsp.bad;

public class AreaCalculator {

    public int calculateArea(Rectangle rectangle) {
        return rectangle.getHight() * rectangle.getWidth();
    }


    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle();
        rectangle.setHight(10);
        rectangle.setWidth(5);
        System.out.println("10*5 -> " + areaCalculator.calculateArea(rectangle));

        Square square = new Square();
        square.setWidth(5);
        System.out.println("5*5 -> " + areaCalculator.calculateArea(square));

        Rectangle substitute = new Square();
        substitute.setHight(10);
        substitute.setWidth(5);
        System.out.println("10*5 -> " + areaCalculator.calculateArea(substitute));
    }


}
