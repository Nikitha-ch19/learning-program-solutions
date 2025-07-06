package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderDemo {
    private static final Logger log = LoggerFactory.getLogger(AppenderDemo.class);

    public static void main(String[] args) {
        log.info("Info message to console & file");
        log.error("Error message to console & file");
    }
}
