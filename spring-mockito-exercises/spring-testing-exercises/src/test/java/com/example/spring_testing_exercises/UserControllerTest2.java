// inside the same class
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
