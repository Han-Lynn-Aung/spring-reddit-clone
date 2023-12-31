package com.example.springredditclone.controllers;

import com.example.springredditclone.dto.SubredditDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subreddit")
@AllArgsConstructor
@Slf4j
public class SubRedditController {

    @PostMapping
    public void createSubReddit(@RequestBody SubredditDto subredditDto){

    }
}
