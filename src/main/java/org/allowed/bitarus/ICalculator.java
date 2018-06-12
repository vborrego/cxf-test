package org.allowed.bitarus;
import javax.jws.WebService;

/*
Show services
http://localhost:8081/cxf-test-0.1/services
JAX-WS service
 */
@WebService
public interface ICalculator {
    long add(long num1 , long num2 );
    long subtract(long num1, long num2 );
}
