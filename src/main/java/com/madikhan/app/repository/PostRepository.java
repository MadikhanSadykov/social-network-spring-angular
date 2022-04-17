package com.madikhan.app.repository;

import com.madikhan.app.entity.Post;
import com.madikhan.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    // SELECT * FROM POST as p WHERE User='user' ORDER BY DESC
    List<Post> findAllByUserOrderByCreatedDateDesc(User user);

    List<Post> findAllByOrderByCreatedDateDesc();

    Optional<Post> findPostByIdAndUser(Long postId, User user);
}
