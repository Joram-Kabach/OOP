package com.joramkabach;
 //Joram Kabach//
//65334//
public class Calculator {

    private double firstNumber;
    private double secondNumber;
    private double thirdNumber;


    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public double getFirstNumber() {
        return firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setThirdNumber(double thirdNumber) {
        this.thirdNumber = thirdNumber;
    }
    public double getThirdNumber() {
        return thirdNumber;
    }
    public double getAdditionResult() {
        return firstNumber+secondNumber+thirdNumber;
    }
    public double getMultiplicationResult() {
        return firstNumber*secondNumber*thirdNumber;
    }
    public double getAverageResult() {
        return (firstNumber+secondNumber+thirdNumber)/3;
    }
}

