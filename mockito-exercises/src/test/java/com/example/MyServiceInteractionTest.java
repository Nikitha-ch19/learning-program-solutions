package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class MyServiceInteractionTest {

    @Test
    void testVerifyInteraction() {
        // 1. Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Inject into service
        MyService service = new MyService(mockApi);

        // 3. Call method that should trigger mock
        service.fetchData();

        // 4. Verify interaction
        verify(mockApi).getData(); // ✅ pass if getData() was called
    }
}
