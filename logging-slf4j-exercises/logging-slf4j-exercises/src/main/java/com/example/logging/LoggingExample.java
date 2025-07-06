package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger log = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        log.error("This is an error message");
        log.warn("This is a warning message");
    }
}
