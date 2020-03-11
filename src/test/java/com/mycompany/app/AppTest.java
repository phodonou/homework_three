package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.mycompany.App;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMainPrintThings() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String[] argsMain = {};
        App.main(argsMain);
        assertFalse("Printing stream is not empty", outContent.toString().isEmpty());
    }
}
