package com.zlrx.solid.lsp.solve;

public class AreaPrinter {

    public void printArea(Shape shape) {
        System.out.println("A terület " + shape.area() + " cm2");
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(5);
        AreaPrinter areaPrinter = new AreaPrinter();
        areaPrinter.printArea(rectangle);
        areaPrinter.printArea(square);
    }

}
