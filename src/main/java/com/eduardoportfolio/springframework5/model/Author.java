package com.eduardoportfolio.springframework5.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eduardo on 04/10/17.
 */
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    //Target Side of the relationship
    @ManyToMany (mappedBy = "authors")
    private Set<Book> book = new HashSet<>();

    public Author() {

    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author(String firstName, String lastName, Set<Book> book) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.book = book;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public Set<Book> getBook() {return book;}

    public void setBook(Set<Book> book) {this.book = book;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return id != null ? id.equals(author.id) : author.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", book=" + book +
                '}';
    }
}

