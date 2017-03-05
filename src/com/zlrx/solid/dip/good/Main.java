package com.zlrx.solid.dip.good;

public class Main {
    public static void main(String[] args) {
        Repository repository = new RepostioryImpl();
        Service service = new ServiceImpl(repository);
        Controller controller = new Controller(service);
        controller.getUsersName().forEach(System.out::println);
    }
}
