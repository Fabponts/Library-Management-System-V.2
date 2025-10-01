package com.example.library.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_BOOKS")
public class Book {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     private String title;
     private String author;
     private String publisher;
     private String genre;
     private String description;

     @Enumerated(EnumType.STRING)
     private BookStatus status = BookStatus.AVAILABLE;

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

