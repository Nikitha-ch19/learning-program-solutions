package com.example.springtestingexercises;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repo;
    public UserService(UserRepository repo) { this.repo = repo; }
    public User getUserById(Long id) { return repo.findById(id).orElse(null); }
    public User saveUser(User u) { return repo.save(u); }
}
