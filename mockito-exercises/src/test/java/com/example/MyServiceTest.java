package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class MyServiceTest {

    @Test
    void testExternalApi() {
        // 1. Mock the dependency
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Stub its behaviour
        when(mockApi.getData()).thenReturn("Mock Data");

        // 3. Inject mock into service
        MyService service = new MyService(mockApi);

        // 4. Call method under test
        String result = service.fetchData();

        // 5. Verify outcome
        assertEquals("Mock Data", result);
        // (Optional) verify the interaction happened once
        verify(mockApi).getData();
    }
}
