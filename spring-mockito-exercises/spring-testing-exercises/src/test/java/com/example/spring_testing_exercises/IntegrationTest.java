package com.example.springtestingexercises;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class IntegrationTest {

    @Autowired MockMvc mockMvc;
    @Autowired UserRepository repo;

    @Test
    void fullFlow_createAndFetch() throws Exception {
        // create
        mockMvc.perform(post("/users")
                .contentType("application/json")
                .content("""{"id":10,"name":"Zoe"}"""))
              .andExpect(status().isOk());

        // verify DB via repository
        assert(repo.findById(10L).isPresent());

        // fetch
        mockMvc.perform(get("/users/10"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.name").value("Zoe"));
    }
}
