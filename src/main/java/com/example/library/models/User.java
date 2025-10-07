package com.example.library.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = " You must insert a name")
    @Size(min = 1, max = 20)
    private String firstName;

    @NotBlank(message = " You must insert a Lastname")
    @Size(min = 1, max = 20)
    private String lastName;

    @NotBlank(message = " You must insert a email")
    @Email(message = "Invalid format")
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Book> books = new ArrayList<>();

    public void setFirstName(String name){
        this.firstName = name;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

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
