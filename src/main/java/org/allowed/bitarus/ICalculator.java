package org.allowed.bitarus;
import javax.jws.WebService;

@WebService
public interface ICalculator {
    long add(long num1 , long num2 );
    long subtract(long num1, long num2 );
}
