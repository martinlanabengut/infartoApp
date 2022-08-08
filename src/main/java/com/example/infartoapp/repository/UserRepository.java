package com.example.infartoapp.repository;

import com.example.infartoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer > {

    public User findByName(String name);

    public User findByLastName(String lastname);

    public User findByEmail(String email);

    public User findBySpeciality(String speciality);

    public User findByRol(String rol);

    public List<User> findByAll();
    public Integer deleteById(int id);









}
