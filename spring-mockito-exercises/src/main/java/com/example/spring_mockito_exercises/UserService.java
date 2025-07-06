package com.example.spring_mockito_exercises;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User getUserById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
