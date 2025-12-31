package com.example.model;

import java.util.Date;

/**
 * @Class Message
 */
public class Message {
    private static int id = 0;
    private String message;
    private Date sentDate;

    /**
     * Constructor
     * @param message
     */
    public Message(String message) {
        id++;
        this.message = message;
        this.sentDate = new Date();
    }

    /**
     * Getter function
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter function
     * @Description set value for message
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter function
     * For retrieve Date for message sent
     * @return Date
     */
    public Date getSentDate() {
        return sentDate;
    }

    /**
     * @Setter
     * @param sentDate
     */
    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }
}
