/*  Curs: Core Java Programming
    Modul: Gestionarea sistemului de fișiere
    Unitate: Fluxurile de date
    Exercitiul 2:
Avem fișierul users.txt cu următorul conținut:

id:01|firstName:Petar|lastName:Petrovic|jmbg:1234567890123
id:02|firstName:Jovan|lastName:Jovanovic|jmbg:1234567890124
id:03|firstName:Nikola|lastName:Nikolic|jmbg:1234567890125

Creați o aplicație care va citi fișierul și va afișa conținutul în următorul format:

User Id: 01
First name: Petar
Last name: Petrovic
Jmbg: 1234567890123
------------------------------------
User Id: 02
First name: Jovan
Last name: Jovanovic
Jmbg: 1234567890124
.....
 */
package Homework38;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\acuteanu\\IdeaProjects\\AndreiCuteanu\\Course\\src\\Homework38\\users.txt"));
        String line;
        while((line=br.readLine())!=null)
        {
            String[] user = line.split("\\|");
            System.out.println("User ID: " + user[0].split("\\:")[1]);
            System.out.println("First Name: " + user[1].split("\\:")[1]);
            System.out.println("Last name: " + user[2].split("\\:")[1]);
            System.out.println("Jmbg: " + user[3].split("\\:")[1]);
            System.out.println("------------------------------------");
        }
        br.close();
    }
}
