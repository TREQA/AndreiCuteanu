package Homework37;

public class Main {
        public static void main(String[] args) {

        try { User u = new User(110,"Andrei","Cuteanu","andrei.c@gmail.com");
        }
        catch (InvalidIdException ex) {
            System.out.println("Invalid Id.");
        }
        catch (InvalidFirstNameException ex){
            System.out.println("Invalid firstName.");
        }
        catch (InvalidLastNameException ex){
            System.out.println("Invalid lastName.");
        }
        catch (InvalidEmailException ex){
            System.out.println("Invalid E-mail");
        }
    }
}

