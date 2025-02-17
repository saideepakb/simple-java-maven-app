package com.mycompany.app;

import java.util.List;

/**
 * Hello world!
 */
public class App {

    public App() {}

    public static void main(String[] args) {
        List<String> strings = List.of("A", "B", "C");
        strings.forEach(App::printMessage); // <- This does not show up in outgoing calls 
        strings.forEach(s -> printMessage(s)); // <- This shows up in outgoing calls
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
