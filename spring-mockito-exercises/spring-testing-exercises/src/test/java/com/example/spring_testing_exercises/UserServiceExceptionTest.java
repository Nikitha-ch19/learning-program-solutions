package com.example.springtestingexercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserServiceExceptionTest {

    @Test
    void requireUser_throws() {
        UserService service = new UserService(id -> java.util.Optional.empty());
        assertThrows(java.util.NoSuchElementException.class, () -> service.requireUser(99L));
    }
}
