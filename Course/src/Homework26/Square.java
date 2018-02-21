package Homework26;

class Square extends Quad implements IGeom {
    public double area() {
        return a*a;
    }

    public double perimeter() {
        return 4*this.a;
    }

    public void setxya(int x, int y, int a) {
        this.x = x;
        this.y = y;
        this.a = a;
    }

}

