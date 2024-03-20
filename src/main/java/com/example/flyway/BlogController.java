package com.example.flyway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/getAllBlogs")
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    @GetMapping("/getBlogById")
    public Blog getBlogById(@RequestParam Long id) {
        return blogService.getBlogById(id);
    }
}
