/* Curs: Core Java Programming
   Modul: Controlul fluxului, buclele și ramificarea
   Unitate: Bucla For
   Exercitiul 2:
În aplicaţie intră şirul următor:

String[][] users = { { "petar" , "petrovic" , "1111" },{"jovan","jovanovic","2222"} , {"zoran","ivanovic","3333"}};

Trebuie să separăm numele utilizatorilor şi să le stocăm într-un şir separat. Acest şir trebuie emis la ieşire.

*/
public class Homework18
{
    public static void main(String[] Andrei)
    {
        String[][] users = { { "petar" , "petrovic" , "1111" },{"jovan","jovanovic","2222"} , {"zoran","ivanovic","3333"}};
        String[] names = new String[users.length];
        String[] names1 = new String[users.length];

        for(int i=0; i<users.length; i++)
            names[i] = users[i][0];
        System.out.println(java.util.Arrays.toString(names));

        for(int i=0; i<users.length; i++)
            names[i] = users[i][1];
        System.out.println(java.util.Arrays.toString(names));
    }
}
