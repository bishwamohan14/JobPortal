package com.discoveryourjob.jobportal.controller;


import com.discoveryourjob.jobportal.model.Post;
import com.discoveryourjob.jobportal.repository.PostRepository;
//import com.discoveryourjob.jobportal.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;

//    @Autowired
//    SearchRepository srepo;

    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException
    {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post>getAllPost()
    {
        return repo.findAll();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }

//    @GetMapping("/posts/{text}")
//    public List<Post> findByText(String text){
//        return srepo.findByText(text);
//    }


}
