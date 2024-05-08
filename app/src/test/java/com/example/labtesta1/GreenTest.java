package com.example.labtesta1;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreenTest {
    @Test
    public void test1()
    {
        Green r = new Green();
        assertEquals("Green", r.showcolor());
    }

}