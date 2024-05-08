package com.example.labtesta1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlueTest
{
    @Test
    public void test1()
    {
        Blue r = new Blue();
        assertEquals("Blue", r.showcolor());
    }
}