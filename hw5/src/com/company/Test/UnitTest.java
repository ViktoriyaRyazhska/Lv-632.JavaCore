package com.company.Test;


import com.company.Calculate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {
    Calculate calculate = new Calculate();
    int[] array = {-2, 3, -2, -4, 7, 2, 4, 12, 10, -12};
    @Test
    public void testAdd() { assertEquals(calculate.find(array), 7);}
}
