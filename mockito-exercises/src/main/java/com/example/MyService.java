package com.example;

/** Service that depends on the ExternalApi. */
public class MyService {

    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;          // inject the dependency
    }

    public String fetchData() {
        return api.getData();    // delegate to the API
    }
}
