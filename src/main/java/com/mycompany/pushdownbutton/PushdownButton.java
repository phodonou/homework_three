package com.mycompany.pushdownbutton;

import com.mycompany.ButtonInterface;
import com.mycompany.LightbulbInterface;

public class PushdownButton implements ButtonInterface {

    private boolean isOn;
    
    public PushdownButton(LightbulbInterface lightbulb) {
        this.isOn = false;
    }

    @Override
    public void switchOn() {
        pushButton();
    }

    @Override
    public void switchOff() {
        pushButton();
    }

    private void pushButton() {
        isOn = !isOn;
        String message = isOn ? "Pushdown On" : "Pushdown Off";
        System.out.println(message);
    }

}