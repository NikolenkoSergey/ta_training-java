package com.epam.training.student_sergey_nikolenko;

import junit.framework.TestCase;
import org.junit.Test;

public class MainTest extends TestCase {

    @Test
    public void testEvenNumber() {

        int number = 2;
        assertEquals(true, Main.evenNumber(number));
    }
}