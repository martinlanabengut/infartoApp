package com.example.infartoapp.entity;

import com.example.infartoapp.enums.Rol;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastname;

    private String speciality;

    @Column(unique = true)
    private String licenseId;

    private String phoneNumber;

    @Column(unique = true)
    private String dni;

    @Column(unique = true)
    private String email;

    private String nationality;
    private Date dateOfBirth;

    @Column(unique = true)
    private Rol rolName;

    private String password;




}
