/*  Curs: Core Java Programming
    Modul: Tipurile de date obiectuale
    Unitate: Stringurile
    Exercitiul 4:
Datele intră în aplicație prin intermediul următoarelor două stringuri:

String[] forbidenChars = { "<",">","'" };
String input = "<div>my 'div' tag</div>";

Trebuie să curățați stringul astfel încât la ieșire să nu apară caracterele: divmy div tag/div.
 */
public class Homework31 {
    public static void main(String[] args){
        String[] forbidenChars = { "<",">","'" };
        String input = "<div>my 'div' tag</div>";
        String output=input;
        for(int i=0;i<forbidenChars.length;i++)
        {
            output = output.replace(forbidenChars[i], "");
        }
        System.out.println(output);
    }
}
