package com.example.springredditclone.repositories;

import com.example.springredditclone.models.Post;
import com.example.springredditclone.models.Subreddit;
import com.example.springredditclone.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
