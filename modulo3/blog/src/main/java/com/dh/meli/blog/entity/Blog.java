package com.dh.meli.blog.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Blog {
    private Long id;
    private String title;
    private String author;
    private String date;

    public Blog(Blog blog) {
        this.id = blog.getId();
        this.title = blog.getTitle();
        this.author = blog.getAuthor();
        this.date = blog.getDate();
    }
}
