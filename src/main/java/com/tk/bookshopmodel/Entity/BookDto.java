package com.tk.bookshopmodel.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    private String bookName;

    private String bookAuthor;

    private String bookDetails;

    private String bookDescription;

    private String bookCategory;

    private double bookPrice;

}
