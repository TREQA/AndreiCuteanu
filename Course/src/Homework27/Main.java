package Homework27;

public class Main {
    public static void main(String[] args){
        Calculator c = new Calculator();
        c.setOperands(10.4, 4.2);
        System.out.println(c.add());
        System.out.println(c.sub());
    }
}
