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

    @OneToMany(mappedBy = "user")
    private List<Book> books = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
