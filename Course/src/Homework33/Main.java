/*  Curs: Core Java Programming
    Modul: Tipurile de date obiectuale
    Unitate: Colecțiile
    Exercitiul 1:
Avem o clasă User:
public class User {
public int Id;
public String name;
public User(int id, String name)
{
this.Id = id;
this.ime = name;
}
}

De asemenea, în metoda Main a aplicației, avem următorul cod:

...
ArrayList usersToAdd = new ArrayList();
usersToAdd.add(new User(4,"Goran"));
usersToAdd.add(new User(2,"Ilija"));
usersToAdd.add(new User(6,"Nikola"));

ArrayList users = new ArrayList ();
users.add(new User(1, "Petar"));
users.add(new User(2, "Jovan"));
users.add(new User(3, "Zoran"));

...
Adăugați toți utilizatorii din lista usersToAdd în lista Users. Dacă există
deja un utilizator cu același ID, înlocuiți vechiul utilizator cu cel nou.

Afisati lista Users.

 */

package Homework33;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList usersToAdd = new ArrayList();
        usersToAdd.add(new User(4,"Goran"));
        usersToAdd.add(new User(2,"Ilija"));
        usersToAdd.add(new User(6,"Nikola"));

        ArrayList users = new ArrayList();
        users.add(new User(1,"Petar"));
        users.add(new User(2,"Jovan"));
        users.add(new User(3,"Zoran"));

        for(int i=0;i<usersToAdd.size();i++){
            boolean userExists = false;
            for(int u=0;u<users.size();u++){
                if(((User)users.get(u)).id==((User)usersToAdd.get(i)).id){
                    users.set(u,(User)usersToAdd.get(i));
                    userExists=true;
                }
            }
            if(!userExists)
                users.add(usersToAdd.get(i));
            else
                userExists=false;
        }

        for (Object u : users)
            System.out.println(((User)u).id+":"+((User)u).name);
        }
}
