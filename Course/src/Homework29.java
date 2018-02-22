/* Curs: Core Java Programming
   Modul: Tipurile de date obiectuale
   Unitate: Stringurile
   Exercitiul 2:
În aplicație intră o listă de fișiere sub forma unui string. Trebuie recunoscute doar fișierele de tip jpg, png sau gif (prin utilizarea
extensiilor acestora) și afișat un mesaj despre tipul lor la ieșire:

Fișierul: picture1.jpg este de tip jpg
Fișierul: picture2.png este de tip png
Fișierul: picture3.gif este de tip gif

Parametrul de intrare:
String[] files = { "picture1.jpg", "text1.txt", "picture2.png", "text2.doc", "picture3.gif" };
*/
public class Homework29 {
    public static void main(String[] args){
        String[] files = { "picture1.jpg", "text1.txt", "picture2.png", "text2.doc", "picture3.gif" };

        for (int f=0;f<files.length;f++){
            if (files[f].endsWith("jpg")){
                System.out.println("File: "+files[f]+" is of jpg type.");
            }
            if (files[f].endsWith("txt")){
                System.out.println("File: "+files[f]+" is of txc type.");
            }
            if (files[f].endsWith("png")){
                System.out.println("File: "+files[f]+" is of png type.");
            }
        }
    }
}
