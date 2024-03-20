package com.example.flyway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    private IBlogDao blogDao;

    public Blog getBlogById(Long id) {
        return blogDao.findById(id).orElse(null);
    }

    public List<Blog> getAllBlogs() {
        return blogDao.findAll();
    }
}
