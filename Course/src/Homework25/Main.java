package Homework25;

public class Main {
    public static void main(String[] args) {

        Pizza p = new Pizza("Capriciossa",25);
        p.addon("tomatoes");
        p.addon("sour cream");

        Sandwich s = new Sandwich("Bacon sandwich", 35);
        s.addon("cucumber");
        s.addon("onion");
        s.addon("tomatoes");

        System.out.println(p);
        System.out.println(s);
    }
}