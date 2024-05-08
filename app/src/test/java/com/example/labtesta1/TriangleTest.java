package com.example.labtesta1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
    @Test
    public void test1()
    {
        Triangle s = new Triangle(3,3,3);
        assertEquals(3.897114317029974, s.area(),0.0);
        assertEquals(9.0, s.perimeter(),0.0);

        assertThrows(IllegalArgumentException.class, ()->
        {
            Square a = new Square(-3);
            a.perimeter();
        });
    }
}