package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import com.mycompany.ButtonInterface;
import com.mycompany.LightbulbInterface;
import com.mycompany.button.Button;
import com.mycompany.lightbulb.Lightbulb;
import com.mycompany.pushdownbutton.PushdownButton;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ButtonInterfaceTest {
    @Test
    public void printsOnCorrectForButton() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        LightbulbInterface lightbulb = new Lightbulb();
        ButtonInterface button = new Button(lightbulb);
        button.switchOn();
        assertTrue("Lightbulb on\nButton switched to ON\n".equals(outContent.toString()));

    }

    @Test
    public void printsoffCorrectForButton() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        LightbulbInterface lightbulb = new Lightbulb();
        ButtonInterface pushdownButton = new PushdownButton(lightbulb);
        pushdownButton.switchOff();
        assertTrue("Pushdown On\n".equals(outContent.toString()));
        pushdownButton.switchOn();
        assertTrue("Pushdown On\nPushdown Off\n".equals(outContent.toString()));
    }
}
