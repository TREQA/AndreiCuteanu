package Homework26;

public class Main {
    public static void main(String[] args){
        Square s = new Square();
        s.setxya(25, 25, 25);
        System.out.println("Square area is: " + s.area() + ".");
        System.out.println("Square perimeter is: " + s.perimeter() + ".");
    }
}
