package com.example.view;

import com.example.model.User;

import java.util.Scanner;

public class ContactView {
    private final User user;
    private final Scanner contact;

    public ContactView(User user) {
        this.user = user;
        this.contact = new Scanner(System.in);
    }

    public void getAllContacts() {
        this.user.getContacts().forEach(contact -> {
            System.out.println(contact.getFirstName() + " " + contact.getLastName());
            System.out.println("Phone number :  " + contact.getPhone());
            System.out.println("Email address: " + contact.getEmail() + " \n");
        });
    }

    public void addNewContact() {

    }

}
