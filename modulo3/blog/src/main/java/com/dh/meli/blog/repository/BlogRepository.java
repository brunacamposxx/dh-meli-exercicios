package com.dh.meli.blog.repository;

import com.dh.meli.blog.entity.Blog;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
@Data
@AllArgsConstructor
public class BlogRepository {
    private final String linkFile = "src/main/resources/blog.json";
    ObjectMapper mapper = new ObjectMapper();

    public void addBlog(Blog blog) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        List<Blog> blogList = getAll();
        blogList = new ArrayList<>(blogList);

        blogList.add(blog);

        try {
            writer.writeValue(new File(linkFile), blogList);
        }catch (Exception ex) {
            System.out.println("Erro ao gravar o arquivo.");
        }
    }

    public Optional<Blog> getBlogById(Long id){
        List<Blog> blogList = null;
        try {
            blogList = Arrays.asList(mapper.readValue(new File(linkFile), Blog[].class));
        } catch (Exception e) {
           e.getMessage();
        }
        for(Blog b: blogList){
            if(b.getId().equals(id)){
                return Optional.of(b);
            }
        }
        return Optional.empty();
    }

    public List<Blog> getAll() {
        List<Blog> blogList = null;
        try {
            blogList = Arrays.asList(mapper.readValue(new File(linkFile), Blog[].class));
        }catch (Exception ex) {

        }
        return blogList;
    }


}
