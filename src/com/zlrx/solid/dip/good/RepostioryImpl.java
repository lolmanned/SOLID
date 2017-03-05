package com.zlrx.solid.dip.good;

import java.util.ArrayList;
import java.util.List;

public class RepostioryImpl implements Repository {
    @Override
    public List<String> loadUsersName() {
        ArrayList<String> queryResult = new ArrayList<>();
        queryResult.add("Erik");
        queryResult.add("Alex");
        return queryResult;
    }
}
