package com.example.infartoapp.services;

import com.example.infartoapp.entity.User;
import com.example.infartoapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public List<User> getUsers( ) {
        return repository.findByAll();
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public String deleteUser(int id) {
         repository.deleteById(id);
         return "Usuario eliminado " + id;
    }

    
}
