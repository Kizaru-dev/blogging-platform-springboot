package com.blog.BloggingProject.servics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.blog.BloggingProject.model.Post;
import com.blog.BloggingProject.repository.PostRepo;
@Service
public class PostService {

    @Autowired
    PostRepo postRepo;
    // home page
    public String viewHomePage(Model model){
        model.addAttribute("posts",postRepo.findAll());
        return "index";
    }
    // add page
    public String newPost(Model model){
        model.addAttribute("post",new Post());
        return "add";
    }
    // save post
    public String savePost(Post post){
        postRepo.save(post);
        return "redirect:/";
    }
    // edit page 
    public String editPost(int id , Model model){
        model.addAttribute("post",postRepo.findById(id).get());
        return "edit";
    }
    // update post
    public String updatePost(Post post){
        postRepo.save(post);
        return "redirect:/";
    }
    // delete post
    public String deletePost(int id){
        postRepo.deleteById(id);
        return "redirect:/";
    }
}
