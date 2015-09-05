package com.collections;

import org.junit.Test;
import com.collections.List;
import com.collections.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    @Test
    public void testSizeDefaultInstantiation() {
        int expectedSize = 0;
        List list = new ArrayList();

        assertEquals("The list.size() method call did not return the expected result.", expectedSize, list.size());
    }

    @Test
    public void testSizeReturnsOne() {
        int expectedSize = 1;
        List list = new ArrayList();
        list.add("test");
        
        assertEquals("The list.size() method should return an int of 1.", expectedSize, list.size());
    }
}
