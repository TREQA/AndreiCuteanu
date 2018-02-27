/*  Curs: Core Java Programming
    Modul: Tipurile de date obiectuale
    Unitate: Colecțiile
    Exercitiul 2:
Pe baza clasei User existente (din exercițiul anterior), am creat
următoarea listă.
ArrayList users = new ArrayList();
users.add(new User(4,"Goran"));
users.add(new User(2,"Ilija"));
users.add(new User(6,"Nikola"));
users.add(new User(1, "Petar"));
users.add(new User(2, "Jovan"));
users.add(new User(3, "Zoran"));
Sortați utilizatorii în funcție de ID și afișați lista la ieșire.

 */
/*
package Homework34;

public class Main {}

    public static void main(String[] args){
        ArrayList users = new ArrayList();
        users.add(new User(4,"Goran"));
        users.add(new User(2,"Ilija"));
        users.add(new User(6,"Nikola"));
        users.add(new User(1, "Petar"));
        users.add(new User(2, "Jovan"));
        users.add(new User(3, "Zoran"));

        int min;
        User tmp;
        for(int i=0;i<users.size();i++){
            min=i;
            for(int u=i;u<users.size();u++){
                if(((User)users.get(u)).id<((User)users.get(min)).id){
                    min=u;
                }
            }
            tmp=(User)users.get(min);
            users.set(min,(User)users.get(i));
            users.set(i, tmp);
        }

        for (User u : users){
            System.out.println(u.id + " : " + u.name);}
    }
}
*/
