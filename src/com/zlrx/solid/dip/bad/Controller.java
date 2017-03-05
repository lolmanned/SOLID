package com.zlrx.solid.dip.bad;

import java.util.List;

public class Controller {
    List<String> getUsersName() {
        Service service = new Service();
        return service.loadUsersNameFromDb();
    }
}
