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
package Homework23;

public class Testare {

        public static void main(String[] args) {
            Circle k = new Circle(4);
            System.out.println(Calc.area(k));
            Rectangle r = new Rectangle(3, 3);
            System.out.println(Calc.area(r));
        }
}
