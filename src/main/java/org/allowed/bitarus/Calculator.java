package org.allowed.bitarus;

public class Calculator implements ICalculator
{
    public Calculator() {
        // shows in Tomcat catalina.out 
        System.out.println("Calculator created ");
    }

    public long add(long num1, long num2) {
        return (num1 + num2);
    }

    public long subtract( long num1, long num2  ){
        return num1 - num2;
    }
}
