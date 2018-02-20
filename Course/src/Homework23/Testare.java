package Homework23;

public class Testare {

        public static void main(String[] args) {
            Circle k = new Circle(4);
            System.out.println(Calc.area(k));
            Rectangle r = new Rectangle(3, 3);
            System.out.println(Calc.area(r));
        }
}