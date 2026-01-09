package com.blog.BloggingProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ; 
    @Column(name = "Title")
    private String title;
    @Column(name = "Content")
    private String content ; 
    @Column(name = "Author")
    private String author ;

    public int getId(){
        return id ; 
    }
    public String getTitle(){
        return title ; 
    }
    public String getContent(){
        return content;
    }
    public String getAuthor(){
        return author;
    }
    public void setId(int id){
        this.id = id ; 
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setContent (String content){
        this.content = content ; 
    }
    public void setAuthor(String author){
        this.author = author ;
    }
    public Post(){

    }
    public  Post(int id , String title , String content , String author){
        this.id = id ; 
        this.title = title ; 
        this.content = content ; 
        this.author = author ;
    }

}
