package com.kubudirira.jpaonetomany.repository;

import com.kubudirira.jpaonetomany.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
