/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.hoangminh.mathutil.core.test;

import org.hoangminh.mathutil.core.MathUtility;
import static org.hoangminh.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ngmin
 */
public class MathUtilityAdvancedTest {

    //hàm chuẩn bị bộ data test để sau đó fill vào hàm
    //assertE() ở dưới
    public static Object[][] initTestDate() {
        Object testData[][] = {{0,1},
                               {1,1}, 
                               {2,2}, 
                               {4,24}, 
                               {6,720}};

        return testData;
    }

    @ParameterizedTest
    @MethodSource("initTestDate")
    public void testFactorialGivenArgumentRunWell(int n, long expected) {
        assertEquals(expected, getFactorial(n));
    }
    
    @Test
    public void testFactorialGivenWrongArguementThrowException(){
//        Executable gF = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                MathUtility.getFactorial(-5);
//            }
//        };
        
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5));
    }
}
