package Homework23;

class Calc {
    public static double area(Object shape) {
        if (shape.getClass() == Circle.class) {
            return Math.pow(((Circle) shape).r, 2) * Math.PI;
        }
        else {
            if (shape.getClass() == Rectangle.class) {
            return Math.pow(((Rectangle) shape).a, ((Rectangle) shape).b);
            }
            else
                return 0;
        }
    }
}
