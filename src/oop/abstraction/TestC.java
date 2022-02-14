package oop.abstraction;

public class TestC implements TestA,TestB {
    @Override
    public void foo() {
        System.out.println("I am the Boss");
    }
    public static void main(String[] args){
        TestC testC = new TestC();
        testC.foo();
    }
}
