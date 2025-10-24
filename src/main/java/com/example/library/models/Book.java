package com.example.library.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "TB_BOOKS")
public class Book {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @NotBlank(message = "You must insert a title")
     @Size(min = 2, message = "The title must be at least 2 characters")
     private String title;

     @NotBlank(message = "You must insert a author")
     @Size(min = 2, message = "The author's name must be at least 2 characters")
     private String author;

     @NotBlank(message = "You must insert a publisher")
     @Size(max = 50, message = "The publisher must be at least 2 characters")
     private String publisher;

     @NotBlank(message = "You must insert a genre")
     @Size(max = 50, message = "The genre must be at least 2 characters")
     private String genre;

     private String description;
     @Enumerated(EnumType.STRING)
     private LoanStatus status = LoanStatus.AVAILABLE;

     @ManyToOne
     @JoinColumn(name = "user_id")
     private User user;

     //Getters and Setters
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

