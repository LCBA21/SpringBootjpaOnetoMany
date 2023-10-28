package com.kubudirira.jpaonetomany.service.implementation;

import com.kubudirira.jpaonetomany.model.Post;
import com.kubudirira.jpaonetomany.model.User;
import com.kubudirira.jpaonetomany.repository.PostRepository;
import com.kubudirira.jpaonetomany.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository post_repo;


    @Override
    public Post updatePost(Integer postId, Post post) {


        Post fetchedPost = post_repo.findById(postId).get();

        fetchedPost.setTitle(post.getTitle());
        fetchedPost.setContent(post.getContent());
        fetchedPost.setPublished_on(post.getPublished_on());

        post_repo.save(fetchedPost);

        return post;
    }
}
