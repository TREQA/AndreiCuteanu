package Homework24;

public class main {
    public static void main(String[] args){
        Circle c = new Circle();
        c.color = "blue";
        c.r = 4;
        System.out.println("Circle color is: "+ c.color+" and its area is: "+(c.area()));

        Square s = new Square();
        s.color = "green";
        s.x = 5;
        System.out.println("Square color is: "+s.color+" and its area is: "+(s.area()));

        Rectangle R = new Rectangle();
        R.color = "red";
        R.x = 6;
        R.y = 3;
        System.out.println("Rectangle color is: "+R.color+" and its area is: "+(R.area()));
    }
}
