/*  Curs: Core Java Programming
    Modul: Gestionarea sistemului de fișiere
    Unitate: Serializarea
    Exercitiul 1:
Este dată clasa User:
public class User {
private int id;
private String email;
private String password;
public void setId(int id){ this.id = id; };
public int getId() { return this.id; }
public void setEmail(String email){ this.email = email; };
public String getEmail() { return this.email; }
public void setPassword(String password){ this.password = password; };
public String getPassword() { return this.password; }
@Override
public String toString()
{
return this.id + " " + this.email + " " + this.password;
}
}

Trebuie să creăm metode adiţionale în această clasă: o metodă pentru
serializarea XML a obiectului şi a doua metodă, care este statică,
pentru crearea obiectului din documentul XML.
Testaţi serializarea şi deserializarea în metoda Main.

 */
package Homework40;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        User u = new User();
        u.setId(5);
        u.setEmail("mail@mail.com");
        u.setPassword("123");
        u.serializeXml("myXml.xml");
    }
}

/*
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        User u = User.deserializeXml("myXml.xml");
        u.setId(5);
        u.setEmail("mail@mail.com");
        u.setPassword("123");
        System.out.println(u);
    }
}
/*