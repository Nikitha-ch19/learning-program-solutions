package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.InOrder;


public class MyServiceInteractionOrderTest {

    @Test
    public void testInteractionOrder() {
        // Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Call method that should call methods in order
        service.performUserAction("user123");

        // Verify order
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).sendNotification("Action started for user123");
        inOrder.verify(mockApi).logAction("Fetched data for user123");
    }
}
