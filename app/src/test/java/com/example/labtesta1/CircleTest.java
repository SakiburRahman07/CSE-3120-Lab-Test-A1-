package com.example.labtesta1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

    @Test
    public void test1()
    {
        Circle s = new Circle(3);
        assertEquals(28.26, s.area(),0.0);
        assertEquals(18.84, s.perimeter(),0.0);

        assertThrows(IllegalArgumentException.class, ()->
        {
            Square a = new Square(-3);
            a.perimeter();
        });
    }

}