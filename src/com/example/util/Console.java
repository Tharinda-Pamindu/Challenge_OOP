package com.example.util;

import java.io.IOException;

public class Console {

    public static void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls")
                    .inheritIO()
                    .start()
                    .waitFor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
