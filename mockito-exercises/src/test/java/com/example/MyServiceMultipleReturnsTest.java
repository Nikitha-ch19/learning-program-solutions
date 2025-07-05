package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceMultipleReturnsTest {

    @Test
    public void testMultipleReturnValues() {
        // Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub getData to return two different values on consecutive calls
        when(mockApi.getData("user123"))
            .thenReturn("First Response")
            .thenReturn("Second Response");

        // Inject into service
        MyService service = new MyService(mockApi);

        // First call
        String firstCall = service.fetchDataForUser("user123");
        assertEquals("First Response", firstCall);

        // Second call
        String secondCall = service.fetchDataForUser("user123");
        assertEquals("Second Response", secondCall);
    }
}
