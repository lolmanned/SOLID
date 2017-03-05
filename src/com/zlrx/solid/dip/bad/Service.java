package com.zlrx.solid.dip.bad;

import java.util.List;

public class Service {
    List<String> loadUsersNameFromDb() {
        Repository repository = new Repository();
        return repository.loadUsersName();
    }
}
