package com.example;

public interface ExternalApi {
    String getData(String userId);  // <- now requires a userId
}
