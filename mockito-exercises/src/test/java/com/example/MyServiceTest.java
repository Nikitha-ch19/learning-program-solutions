package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData("user123")).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchDataForUser("user123");

        assertEquals("Mock Data", result);
    }
}
