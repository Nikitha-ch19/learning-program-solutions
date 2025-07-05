package com.example;

public class MyService {

    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchDataForUser(String userId) {
        return api.getData(userId);
    }

    public void notifyUser(String message) {
        api.sendNotification(message);  // <-- This is the void method we will verify
    }
    public void performUserAction(String userId) {
    api.sendNotification("Action started for " + userId);
    api.logAction("Fetched data for " + userId);
}

}
