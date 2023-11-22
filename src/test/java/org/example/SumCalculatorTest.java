package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    SumCalculator calc;

    @BeforeEach
     void dimCalc(){
        //Given
        calc = new SumCalculator();
    }

    @Test
     void sumTestOne(){
        //When
        int expected = 1;
        int actual = calc.sum(1);
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
     void sumTestThree(){
        //When
        int expected = 6;
        int actual = calc.sum(3);
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
     void sumTestZeroException(){
        Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> calc.sum(0));
    }
}
