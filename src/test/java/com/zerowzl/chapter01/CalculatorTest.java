package com.zerowzl.chapter01;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wangzhiliang
 */
public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        double result = calculator.add(1, 2);
        assertEquals(3, result, 0);
    }
}