package com.tk.bookshopmodel.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String bookName;

    private String bookAuthor;

    private String bookDetails;

    private String bookDescription;

    private String bookCategory;

    private double bookPrice;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookDetails='" + bookDetails + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", bookCategory='" + bookCategory + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
