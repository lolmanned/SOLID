package com.zlrx.solid.dip.bad;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.getUsersName().forEach(System.out::println);
    }
}
