package com.dh.meli.blog.service;

import com.dh.meli.blog.entity.Blog;
import com.dh.meli.blog.exception.NotFoundException;
import com.dh.meli.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

    public void addBlog(Blog blog) {
        blogRepository.addBlog(blog);
    }
    public Blog getBlogById(Long id) throws NotFoundException {
        Optional<Blog> blog = blogRepository.getBlogById(id);

        if (blog.isEmpty()) {
            throw new NotFoundException("Blog not found");
        }

        return blog.get();

    }

    public List<Blog> getAll() {
        return blogRepository.getAll().stream()
                .map(Blog::new)
                .collect(Collectors.toList());
    }

}
