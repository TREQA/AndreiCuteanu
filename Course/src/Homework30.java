/* Curs: Core Java Programming
   Modul: Tipurile de date obiectuale
   Unitate: Stringurile
   Exercitiul 3:
Datele intră în aplicație prin intermediul următorului string:

String users = "firstName: Vladimir|lastName:
Vladimirovic|firstName: Jovan|lastName:
Jovanovicc|firstName: Petar|lastName: Petrovic";
Formatați datele astfel încât să obțineți următoarea ieșire:

user first name is : Vladimir, user last name is : Vladimirovic
 */
public class Homework30 {
    public static void main(String[] args){
        String users = "firstName: Vladimir|lastName: Vladimirovic|firstName: Jovan|lastName: Jovanovicc|firstName: Petar|lastName: Petrovic";
        String[] usersArray = users.split("\\|");
        for (int u = 0; u<usersArray.length; u+=2){
            String firstName = usersArray[u].split(" ")[1];
            String lastName = usersArray[u+1].split(" ")[1];
            System.out.println("User's first name is: " + firstName + " and user's last name is: " + lastName);
        }
    }
}