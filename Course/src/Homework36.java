/*  Curs: Core Java Programming
    Modul: Gestionarea excepțiilor
    Unitate: Gestionarea și generarea excepțiilor în Java
    Exercitiul 1:
Securizați aplicația existentă astfel încât să nu raporteze o eroare.
public class Main {
    static int calculate(int a, int b, String op){
        if(op.equals("+"))
            return a+b;
        if(op.equals("-"))
            return a-b;
        if(op.equals("/"))
            return a/b;
        if(op.equals("*"))
            return a*b;

        return 0;
    }
    public static void main(String[] args){
        int x = calculate(5,0,"/");
        System.out.println(x);
    }
}
*/

public class Homework36 {
    static int calculate(int a, int b, String op){
        if(op.equals("+"))
            return a+b;
        if(op.equals("-"))
            return a-b;
        if(op.equals("/"))
            return a/b;
        if(op.equals("*"))
            return a*b;
        return 0;
    }
    public static void main(String[] args){
        try {calculate(5,0,"/");
            System.out.println(calculate(5,0,"/"));
        }
        catch(ArithmeticException ex)
        {
            System.out.println("The result cannot be calculated.");
        }
    }
}
