package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceExceptionTest {

    @Test
    public void testVoidMethodThrowsException() {
        // Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub void method to throw exception
        doThrow(new RuntimeException("Network error")).when(mockApi).sendNotification("Hello user456");

        // Inject into service
        MyService service = new MyService(mockApi);

        // Call the method that handles the exception
        service.notifyUser("user456");

        // Verify it was still called
        verify(mockApi).sendNotification("Hello user456");
    }
}
