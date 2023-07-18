package com.example.springredditclone.services;

import com.example.springredditclone.dto.SubredditDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class SubredditService {

    public void save(SubredditDto subredditDto){
        mapSubredditDto(subredditDto);
    }

    private void mapSubredditDto(SubredditDto subredditDto) {
    }
}
