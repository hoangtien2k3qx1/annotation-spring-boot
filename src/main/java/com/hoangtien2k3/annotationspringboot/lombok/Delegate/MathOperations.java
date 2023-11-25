package com.hoangtien2k3.annotationspringboot.lombok.Delegate;

import lombok.experimental.Delegate;

/**
 * @author: hoangtien2k3
 * @create: 25/11/2023 - 11:24
 * @project: MathOperations.java
 * @description: @Delegate
 * @update: 25/11/2023
 */
public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
}

class Calculator {

    /*
    * thay vì việc phải kế thừa và triển khai lại MathOperations
    * */
    @Delegate
    private final MathOperations mathOperations = new MathOperations();

    public void display() {
        System.out.println("Calculator display");
    }
}

class test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3); // Gọi phương thức add từ MathOperations
        System.out.println("Result: " + result);

        calculator.display();
    }
}