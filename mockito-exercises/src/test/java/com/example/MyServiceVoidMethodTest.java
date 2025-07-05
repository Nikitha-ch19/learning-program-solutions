package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceVoidMethodTest {

    @Test
    public void testVoidMethodInteraction() {
        // Create a mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Inject into service
        MyService service = new MyService(mockApi);

        // Call the method that uses the void method
        service.notifyUser("Hello!");

        // Verify the interaction
        verify(mockApi).sendNotification("Hello!");
    }
}
