package com.example;

public class MyService {

    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchDataForUser(String userId) {
        return api.getData(userId);
    }

    public void performUserAction(String userId) {
    api.sendNotification("Action started for " + userId);
    api.logAction("Fetched data for " + userId);
}

    public void notifyUser(String userId) {
    try {
        api.sendNotification("Hello " + userId);
    } catch (RuntimeException e) {
        System.out.println("Notification failed: " + e.getMessage());
    }
}


}
