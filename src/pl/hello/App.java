package pl.hello;

import pl.hello.arduino.Serial;

public class App {

    public static void main(String[] args) {

        Serial main = new Serial();
        main.initialize();

    }
}
