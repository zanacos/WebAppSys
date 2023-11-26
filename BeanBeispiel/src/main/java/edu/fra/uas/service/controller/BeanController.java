package edu.fra.uas.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.service.MessageService;

@Component
public class BeanController {
    @Autowired
    private MessageService messageService;

    public String putMessage(String message) {
        messageService.setMessage("put message: " + message);
        return messageService.getMessage();
    }
}
