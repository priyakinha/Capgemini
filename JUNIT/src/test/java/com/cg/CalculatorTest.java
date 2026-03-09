package com.cg;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;



public class CalculatorTest {
//    Calculator cal;
    static Calculator cal;

//    @BeforEach
//    public  void init(){
//        cal=new Calculator();
//        System.out.println("Calculator object created");
//    }

    @BeforeAll
    public static void init(){
        cal=new Calculator();
        System.out.println("Calculator object created");
    }

//    @AfterEach
//    public  void destroy(){
//        cal=null;
//        System.out.println("Calculator object destroyed");
//    }

    @AfterAll
    public static void destroy(){
        cal=null;
        System.out.println("Calculator object destroyed");
    }

    //@Test
    @DisplayName(value="Testing Calculate Method")
    @ParameterizedTest
    @CsvSource({"2,4,6","6,5,11","10,15,25"})

    public void calTest(int num1,int num2,int res){
        System.out.println("Testing calculate method");
        assertEquals(res,cal.calculate(num1,num2));
    }



//    @Test
    @Timeout(2)
//    @Timeout(value=10,unit= TimeUnit.MILLISECONDS)
//    @Timeout(value=1000000,unit= TimeUnit.NANOSECONDS)

@ParameterizedTest
    @ValueSource(ints={13,17,19,29,53,63})
    public void isPrimeTest(int num){
        System.out.println("Testing isPrime method");
        assertTrue(cal.isPrime(num));
//        assertTrue(cal.isPrime(13));
//        assertFalse(cal.isPrime(1));
//        assertFalse(cal.isPrime(16));
    }
}
