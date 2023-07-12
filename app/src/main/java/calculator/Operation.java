package calculator;

import com.google.common.math.BigIntegerMath;

import java.math.BigInteger;
import java.util.Scanner;

public class Operation {

    private int result;
    public Operation() {

    }

    public int add(int number1,int number2){

       return number1+number2;
    }
    public int subtract(int number1,int number2){

        return result = number1 - number2;

    }
    public int multiply(int number1,int number2){
        return number1 * number2;

    }
    public BigInteger factorial(int number1){

        return BigIntegerMath.factorial(number1);

    }
}
