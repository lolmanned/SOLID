package com.zlrx.solid.dip.bad;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<String> loadUsersName() {
        ArrayList<String> queryResult = new ArrayList<>();
        queryResult.add("Erik");
        queryResult.add("Alex");
        return queryResult;
    }
}
