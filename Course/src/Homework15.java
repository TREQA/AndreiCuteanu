/* Curs: Core Java Programming
   Modul: Controlul fluxului, buclele și ramificarea
   Unitate: Controlul fluxului - Switch
   Exercitiul 1:
   În program, intră următoarele date:
//input data
int x = 523134;
int y = 325423;

Trebuie să verificăm restul împărţirii dintre x şi y. Dacă nu există rest,
trebuie să se afişeze mesajul că restul nu există, în caz contrar, trebuie
să se verifice dacă restul este mai mare sau mai mic decât o mie şi să
se afişeze mesajul corespunzător.
 */

public class Homework15 {
    public static void main(String[] Andrei) {
        //input data
        int x = 523124;
        int y = 325423;
        int rest = x%y;

        switch(rest)
        {
            case 0:
                System.out.println("Division without rest.");
            break;
            default:
                if(rest<1000)
                    System.out.println("Rest is less than 1000.");
                else
                    System.out.println("Rest is greater than 1000.");
                break;
        }

    }
}
