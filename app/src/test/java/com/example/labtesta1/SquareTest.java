package com.example.labtesta1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

    @Test
    public void test1()
    {
        Square s = new Square(3);
        assertEquals(9, s.area(),0.0);
        assertEquals(12, s.perimeter(),0.0);

        assertThrows(IllegalArgumentException.class, ()->
        {
           Square a = new Square(-3);
           a.perimeter();
        });
    }



}