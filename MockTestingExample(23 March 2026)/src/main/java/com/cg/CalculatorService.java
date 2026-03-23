package com.cg;

public class CalculatorService {
    private ICalculator cal;
    public CalculatorService(){}
    public CalculatorService(ICalculator cal) {//----constructor injection
        this.cal = cal;
    }
    public int addService(int x,int y){
        return cal.calculate(x,y);
    }

}
