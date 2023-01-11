import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fight() {
        String consoleOutput = null;
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(100);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            Superhero one = Factory.createWolverine();
            Superhero two = Factory.createWolverine();

            Superhero superhero = Factory.createSuperman();
            Superhero superhero2 = Factory.createSuperman();
            Main.fight(one, two, superhero, superhero2);
            capture.flush();
            consoleOutput = outputStream.toString();
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(true, consoleOutput.contains("Вы выиграли"));
    }

    @Test
    void fight2() {
        String consoleOutput = null;
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(100);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            Superhero one = Factory.createAquaman();
            Superhero two = Factory.createWolverine();
            Superhero superhero = Factory.createSuperman();
            Superhero superhero2 = Factory.createHulk();
            Main.fight(one, two, superhero, superhero2);
            capture.flush();
            consoleOutput = outputStream.toString();
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(true, consoleOutput.contains("Вы выиграли"));
    }

    @Test
    void fight3() {
        String consoleOutput = null;
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(100);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            Superhero one = Factory.createHulk();
            Superhero two = Factory.createSuperman();
            Superhero superhero = Factory.createSuperman();
            Superhero superhero2 = Factory.createWolverine();
            Main.fight(one, two, superhero, superhero2);
            capture.flush();
            consoleOutput = outputStream.toString();
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(false, consoleOutput.contains("Вы выиграли"));
    }

    @Test
    void fight4() {
        String consoleOutput = null;
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(100);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            Superhero one = Factory.createSuperman();
            Superhero two = Factory.createSuperman();
            Superhero superhero = Factory.createWolverine();
            Superhero superhero2 = Factory.createWolverine();
            Main.fight(one, two, superhero, superhero2);
            capture.flush();
            consoleOutput = outputStream.toString();
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(false, consoleOutput.contains("Вы выиграли"));
    }

    @Test
    void fight5() {
        String consoleOutput = null;
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(100);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            Superhero one = Factory.createSuperman();
            Superhero two = Factory.createWolverine();
            Superhero superhero = Factory.createHulk();
            Superhero superhero2 = Factory.createSuperman();
            Main.fight(one, two, superhero, superhero2);
            capture.flush();
            consoleOutput = outputStream.toString();
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(true, consoleOutput.contains("Вы выиграли"));
    }

    @Test
    void fight6() {
        String consoleOutput = null;
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(100);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            Superhero one = Factory.createSuperman();
            Superhero two = Factory.createHulk();
            Superhero superhero = Factory.createAquaman();
            Superhero superhero2 = Factory.createWolverine();
            Main.fight(one, two, superhero, superhero2);
            capture.flush();
            consoleOutput = outputStream.toString();
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(false, consoleOutput.contains("Вы выиграли"));
    }
}