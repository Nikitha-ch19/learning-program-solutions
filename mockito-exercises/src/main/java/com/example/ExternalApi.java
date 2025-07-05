package com.example;

public interface ExternalApi {
    String getData(String userId);
    void sendNotification(String message);  // <-- New void method
}
