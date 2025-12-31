package com.example.view;

import com.example.model.Message;
import com.example.model.User;

import java.util.Scanner;

public class MessageView {

    private final User user;
    private final Scanner msg;

    public MessageView(User user) {
        this.user = user;
        msg = new Scanner(System.in);
    }

    public void sendMessage() {
        System.out.println("\n+-------------------------------+\n|         Message Sender        |\n+-------------------------------+\n");
        System.out.print("Enter your message: ");
        String message = msg.nextLine();
        this.user.setMessage(new Message(message));
    }

    public void allMessage() {
        user.getMessages().forEach(message -> {
            System.out.println("Message : " + message.getMessage());
            System.out.println("Time : " + message.getSentDate() + "\n");
        });
    }
}
