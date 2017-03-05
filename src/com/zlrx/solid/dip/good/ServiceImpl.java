package com.zlrx.solid.dip.good;

import java.util.List;

public class ServiceImpl implements Service {

    private final Repository repository;

    public ServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public List<String> loadUsersNameFromDb() {
        return repository.loadUsersName();
    }
}
