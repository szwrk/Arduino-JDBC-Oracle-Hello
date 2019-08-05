package pl.hello.entity;

import pl.hello.arduino.*;

public class EntityTest {
    private int ID;
    private String tekst;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekstfromSerialInput(String tekst) {
        this.tekst = Serial.getInputLine();

    }
}
