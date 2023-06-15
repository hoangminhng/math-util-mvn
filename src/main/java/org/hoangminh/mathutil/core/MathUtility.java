/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hoangminh.mathutil.core;

/**
 *
 * @author ngmin
 */

//class này clone lai 100% cái class java.util.Math c?a JDK
//Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    public static final double PI = 3.1415;
    
    
    //tính n! = 1.2.3.4. ... .n
    //quy u?c cho hàm/method này 
    //0! = 1! = 1
    //ko áp dung giai thua n < 0. If n < 0 => ditmemay
    //ko áp dung cho n > 20 Vì 20! in range of long datatype
    public static long getFactorial(int n){
        long product = 1;
        if (n == 0 || n == 1)
            return 1;
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("ÐCM NGU Z :)))). n in range [0,20]");
        for (int i = 1; i <= n; i++)
            product *= i;
        
        return product;
    }
}
