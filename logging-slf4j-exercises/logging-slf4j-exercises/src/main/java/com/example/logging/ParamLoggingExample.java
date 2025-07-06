package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParamLoggingExample {
    private static final Logger log = LoggerFactory.getLogger(ParamLoggingExample.class);

    public static void main(String[] args) {
        String user = "Alice";
        int items = 5;
        log.info("User {} purchased {} items.", user, items);
        log.debug("Debugging values: user={}, items={}", user, items);
    }
}
