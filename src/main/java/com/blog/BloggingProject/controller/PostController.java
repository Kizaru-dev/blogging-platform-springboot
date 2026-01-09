package com.blog.BloggingProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import com.blog.BloggingProject.model.Post;
import com.blog.BloggingProject.servics.PostService;

@Controller
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        return postService.viewHomePage(model);
    }
    @GetMapping("/add")
    public String newPost(Model model){
        return postService.newPost(model);
    }

    @PostMapping("/save")
    public String savePost(@ModelAttribute("post") Post post){
       return  postService.savePost(post);
        
    }

    @GetMapping("/edit/{id}")
    public String editPost(@PathVariable int id , Model model){
        return postService.editPost(id,model);
    }
    @PostMapping("/update")
    public String updatePost(@PathVariable int id , @ModelAttribute("post") Post post){
        return postService.updatePost(post);
    }


    @GetMapping("/delete/{id}")
    public String deletePost(@PathVariable int id){
        return postService.deletePost(id);
    }
}
