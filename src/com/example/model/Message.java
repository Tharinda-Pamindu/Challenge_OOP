package com.example.model;

import java.util.Date;

/**
 * @Class Message
 */
public class Message {
    private String message;
    private Date sentDate;

    /**
     * Constructor
     *
     * @param message
     */
    public Message(String message) {
        this.message = message;
        this.sentDate = new Date();
    }

    /**
     * Getter function
     *
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter function
     *
     * @param message
     * @Description set value for message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter function
     * For retrieve Date for message sent
     *
     * @return Date
     */
    public Date getSentDate() {
        return sentDate;
    }

    /**
     * @param sentDate
     * @Setter
     */
    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }
}
