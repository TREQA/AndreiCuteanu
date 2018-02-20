/* Curs: Core Java Programming
   Modul: Controlul fluxului, buclele și ramificarea
   Unitate: Controlul fluxului - Switch

   Exercitiul 2:
  Avem următoarele date de intrare pentru un automobil:
String carMake = "Ford";
int doors = 4;
  Trebuie să se facă o structură condițională care va verifica dacă
producătorul automobilului este Ford și, dacă este, în funcție de
numărul de uși, să afișeze mesajul adecvat.

 */
public class Homework16 {
    public static void main(String[] Anrei){

        String carMake = "Ford";
        int doors = 4;

        switch(carMake)
        {
            case "Ford":
                switch(doors)
                {
                    case 3:
                        System.out.println("You drive a car with three doors.");
                        break;
                    case 4:
                        System.out.println("You drive a car with four doors.");
                        break;
                    case 5:
                        System.out.println("You drive a car with five doors.");
                        break;
                }
                break;
                default:
                System.out.println("You do NOT drive a Ford car.");
        }
    } 
}
