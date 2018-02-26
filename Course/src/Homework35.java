/*  Curs: Core Java Programming
    Modul: Tipurile de date obiectuale
    Unitate: Gestionarea datei și a timpului
    Exercitiul 1:
Creați un program care va afișa la ieșire toate lunile anului curent și
durata lor.
 */
import java.time.LocalDate;
import java.time.Month;

public class Homework35 {
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        for (Month month : Month.values()) {
            System.out.println(month + " " + month.length(now.isLeapYear()));
    }
}
}
