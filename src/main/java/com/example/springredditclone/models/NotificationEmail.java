package com.example.springredditclone.models;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationEmail {

    private String subject;
    private String recipient;
    private String body;
}
