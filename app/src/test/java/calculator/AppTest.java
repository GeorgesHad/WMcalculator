/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package calculator;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void add(){
        Operation op= new Operation();
        assertEquals(7,op.add(3,4));
    }
    @Test void subtract()
    {
        Operation op= new Operation();
        assertEquals(1,op.subtract(5,4));
    }
    @Test void multiply(){
        Operation op= new Operation();
        assertEquals(12,op.multiply(3,4));
    }
    @Test void factorial()
    {
        Operation op= new Operation();
        assertEquals( BigInteger.valueOf(6),op.factorial(3));
    }
}
