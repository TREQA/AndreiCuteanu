package Homework27;

class Calculator implements Operands,Operations {
    public double operand1;
    public double operand2;
    public double add() {
        return operand1+operand2;
    }
    public double sub() {
        return operand1-operand2;
    }
    public void setOperands(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
}