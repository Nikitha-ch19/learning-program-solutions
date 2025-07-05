package com.example;

public class MyService {

    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchDataForUser(String userId) {
        return api.getData(userId);  // <- uses the userId
    }
}
