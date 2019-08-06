package pl.hello;

import pl.hello.arduino.Serial;

public class App extends Serial {

    public static void main(String[] args){

        Serial main = new Serial();
        main.initialize();
        //todo popraw blad: void serialEvent(SerialPortEvent oEvent -java.io.IOException: Underlying input stream returned zero bytes
    }
}
