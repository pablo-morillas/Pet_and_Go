package io.github.ceraalex99.petandgo;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void sum() {
        Main main = new Main();
        int a = 2;
        int b = 3;
        assertEquals(5, main.sum(a,b));
    }

    @Test
    public void mult() {
        Main main = new Main();
        int a = 2;
        int b = 3;
        assertEquals(6, main.mult(a,b));
    }
}