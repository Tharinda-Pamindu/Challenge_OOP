package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private List<Contact> contacts;
    private List<Message> messages;

    /**
     * @param firstName required
     * @param lastName  required
     */
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    /**
     * @Default
     * @Constructor
     */
    public User() {
        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    /**
     * @return firstName
     * @Type String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName required
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return lastName
     * @Type String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName required
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return Contact
     * @Type List
     * @see Contact
     * @see List
     * @see java.util.Collection
     */
    public List<Contact> getContacts() {
        return contacts;
    }

    /**
     * @param contacts required
     * @see Contact
     * @see List
     * @see java.util.Collection
     */
    public void setContacts(List<Contact> contacts) {
        if (contacts != null) {
            this.contacts.addAll(contacts);
        }
    }

    /**
     * @return Message
     * @Type List
     * @see Message
     * @see List
     * @see java.util.Collection
     */
    public List<Message> getMessages() {
        return messages;
    }

    /**
     * @param messages required
     * @see Message
     * @see List
     * @see java.util.Collection
     */
    public void setMessages(List<Message> messages) {
        if (messages != null) {
            this.messages.addAll(messages);
        }
    }

    /**
     * @param contact required
     */
    public void deleteContact(Contact contact) {
        if (contact != null) {
            if (this.contacts.contains(contact)) {
                this.contacts.remove(contact);
            } else {
                System.out.println("Contact not found");
            }
        } else {
            System.out.println("Contact is null");
        }
    }

    /**
     *
     * @param message required
     */
    public void deleteMessage(Message message) {
        if (message != null) {
            if (this.messages.contains(message)) {
                this.messages.remove(message);
            } else {
                System.out.println("Message not found");
            }
        } else {
            System.out.println("Message is null");
        }
    }

    /**
     *
     * @param contact required
     * @return contact
     * @Type Contact
     * @see Contact
     */
    public Contact getContact(Contact contact) {
        if (contact != null) {
            //TODO: implement the method body
        }
        return null;
    }

}
