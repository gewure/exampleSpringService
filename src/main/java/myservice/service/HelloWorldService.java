package myservice.service;

import myservice.model.CalculatorExample;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    CalculatorExample calculator = new CalculatorExample();

    public int calculate(int n, String name) {
     return calculator.calc(n, name.length());
    }
}
