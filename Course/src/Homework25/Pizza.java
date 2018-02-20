package Homework25;

public class Pizza extends Product {
    public Pizza(String name, double price)
    {
        this.addons = new String[10];
        this.name = name;
        this.price = price;
    }
    public double countPrice() {
        return this.price + this.price*0.1;
    }
}
