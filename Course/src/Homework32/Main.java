/*  Curs: Core Java Programming
    Modul: Tipurile de date obiectuale
    Unitate: Enumerările
    Exercitiul 1:
În cadrul aplicației noastre web am obținut următorul string care transmite parametri în următoru format:

serverId=25&serverName=my name&serverStatus=Running

Creați o clasă Server cu următoarele câmpuri: Id, Name and Status.
Creați o enumerare cu statusurile serverului (Stopped, Running, Unknown) și o metodă care izolează
parametrii (din probleme) și creează o instanță a clasei Server pe baza lor.
Trebuie suprascrisă metoda toString a clasei Server și afișat ID-ul, numele și statusul serverului în ea.
Realizați soluții de test prin intermediul metodei Main a clasei Main.

 */
package Homework32;

public class Main {
    public static void main(String[] args){
        Server s = new Server("serverId=25&serverName=my name&serverStatus=Stopped");
        System.out.println(s);
    }
}
