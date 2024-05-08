package com.example.labtesta1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RedTest {

    @Test
    public void test1()
    {
        Red r = new Red();
        assertEquals("Red", r.showcolor());
    }

}