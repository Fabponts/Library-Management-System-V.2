package com.example.library.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TB_USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = " You must insert a email")
    @Email(message = "Invalid format")
    private String email;

    @NotBlank(message = "You must insert a password")
    @Size(min = 6, max = 20)
    private String password;

    private Set<Role> roles;

    @OneToMany(mappedBy = "user")
    private List<Book> books = new ArrayList<>();

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public Long getId(){
        return this.id;
    }
}
