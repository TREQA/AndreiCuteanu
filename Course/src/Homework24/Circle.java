package Homework24;

public class Circle extends Shape{
    public String blue;
    public double r;
    public final double PI = 3.14;
    public double area(){
        return Math.pow(r, 2)*PI;
    }
}
