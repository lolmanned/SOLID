package com.zlrx.solid.dip.good;

import java.util.List;

public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    List<String> getUsersName() {
        return service.loadUsersNameFromDb();
    }
}
