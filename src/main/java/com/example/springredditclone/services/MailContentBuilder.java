package com.example.springredditclone.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.thymeleaf.*;
import org.thymeleaf.context.Context;

@Service
@AllArgsConstructor
public class MailContentBuilder {

    private final TemplateEngine templateEngine;

    String  build(String message){
        Context content = new Context();
        content.setVariable("message",message);

        return templateEngine.process("mailTemplate",content);
    }
}
