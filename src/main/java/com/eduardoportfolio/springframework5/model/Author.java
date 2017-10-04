package com.eduardoportfolio.springframework5.model;

import java.util.HashSet;

/**
 * Created by Eduardo on 04/10/17.
 */
public class Author {

    private String firstName;
    private String lastName;

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

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public Set<Book> getBook() {return book;}

    public void setBook(Set<Book> book) {this.book = book;}
}
