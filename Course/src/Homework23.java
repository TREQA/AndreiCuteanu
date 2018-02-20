/* Curs: Core Java Programming
   Modul: Programarea orientată pe obiecte în Java
   Unitate: Elementele clasei
   Exercitiul 2:
Trebuie create 3 clase. Prima este clasa Circle şi ea conţine
proprietatea r (raza). A doua clasă este Rectangle şi conţine
proprietăţile a şi b. A treia clasă se numeşte Calc şi conţine metoda
statică area care, ca parametru, acceptă o instanţă a clasei (Circle sau
Rectangle), iar ca rezultat prezintă aria formei introduse. În funcţie
dacă în metodă a intrat instanţa clasei Circle sau Rectangle, va fi
executată formula de calculare a ariei pentru Circle sau Rectangle.
 */

public class Homework23 {
    public static void main(String[] args) {
    }

    public class Circle {
        public double r;

        public Circle(int r) {
            this.r = r;
        }
    }

    public class Rectangle {
        public double a;
        public double b;

        public Rectangle(double a, double b) {
            this.a = a;
            this.b = b;
        }
    }

    public static class Calc {
        public static double area(Object shape) {
            if (shape.getClass() == Circle.class) {
                return Math.pow(((Circle) shape).r, 2) * Math.PI;
            }
            if (shape.getClass() == Rectangle.class) {
                return Math.pow(((Rectangle) shape).a, ((Rectangle) shape).b);
            }
            else
            return 0;
        }
    }
}

