package com.mycompany.button;

import com.mycompany.ButtonInterface;
import com.mycompany.LightbulbInterface;

public class Button implements ButtonInterface {

    private LightbulbInterface lightbulb;

    public Button(LightbulbInterface lightbulb) {
        this.lightbulb = lightbulb;
    }

    public void switchOn() {
        this.lightbulb.on();
        System.out.println("Button switched to ON");
    }

    public void switchOff() {
        this.lightbulb.off();
        System.out.println("Button switched to OFF");
    }
}