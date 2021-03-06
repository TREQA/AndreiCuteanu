/* Curs: Core Java Programming
   Modul: Programarea orientată pe obiecte în Java
   Unitate: Clase şi obiecte
   Exercitiul 1 + Exercitiul 2
Ex.1: Trebuie creată clasa Animal care va fi definită ca una abstractă, iar
apoi trebuie create două clase, Horse şi Dog, care vor moşteni prima
clasă Animal.
Ex.2: Trebuie executată instanţierea claselor din exerciţiul precedent.
 */
public class Homework21 {
    public static void main(String[] args) {
        abstract class Animal {
            class Horse extends Animal {
                Horse horse = new Horse();
            }
            class Dog extends Animal{
                Dog dog = new Dog();
            }
        }
    }
}
