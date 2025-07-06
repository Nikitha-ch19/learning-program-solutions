package com.example.springtestingexercises;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired private MockMvc mockMvc;
    @MockBean private UserService userService;

    @Test
void createUser_returnsCreatedUser() throws Exception {
    User joe = new User(); joe.setId(5L); joe.setName("Joe");
    Mockito.when(userService.saveUser(Mockito.any())).thenReturn(joe);

    mockMvc.perform(post("/users")
            .contentType("application/json")
            .content("""{"id":5,"name":"Ignored"}"""))
           .andExpect(status().isOk())
           .andExpect(jsonPath("$.id").value(5))
           .andExpect(jsonPath("$.name").value("Joe"));
}

}
