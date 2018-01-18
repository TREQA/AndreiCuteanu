/* Curs: Core Java Programming
   Modul: Controlul fluxului, buclele și ramificarea
   Unitate: Buclele while şi do while
   Exercitiul 2:
Modificați codul din exerciţiul precedent pentru a se executa folosind
bucla do-while.
 */
public class Homework20 {
    public static void main(String[] Andrei) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 0;

        do {
            System.out.println(arr[x]);
            x++;
        } while (x<arr.length);
    }
}
