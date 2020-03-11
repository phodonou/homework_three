package com.mycompany;

import com.mycompany.button.Button;
import com.mycompany.lightbulb.Lightbulb;
import com.mycompany.pushdownbutton.PushdownButton;

public class App {

    public static void main(String[] args) {

        final LightbulbInterface lightbulb = new Lightbulb();

        ButtonInterface button = new Button(lightbulb);
        button.switchOn();
        button.switchOff();
        button = new PushdownButton(lightbulb);
        button.switchOn();
        button.switchOff();
    }
}