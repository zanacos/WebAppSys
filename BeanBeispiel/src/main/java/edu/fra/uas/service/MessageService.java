package edu.fra.uas.service;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    private static final Logger logger = Logger.getLogger(MessageService.class.getName());

    private String message;

    public String getMessage() {
        logger.info("getting the current message" + message);
        return message;
    }

    public void setMessage(String message) {
        logger.info("Setting the message to " + message);
        this.message = message;
    }

}
