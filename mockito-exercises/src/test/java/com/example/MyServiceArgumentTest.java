package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;

class MyServiceArgumentTest {

    @Test
    void testArgumentMatching() {
        // Mock the API
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub getData with specific argument
        when(mockApi.getData(eq("user123"))).thenReturn("Data for user123");

        // Inject into service
        MyService service = new MyService(mockApi);

        // Call method
        String result = service.fetchDataForUser("user123");

        // Assert return value
        assertEquals("Data for user123", result);

        // Verify interaction with matcher
        verify(mockApi).getData(eq("user123"));
    }
}
