/* Exercitiul 1 - CJPR05

Numele variabilelor trebuie schimbate astfel încât să fie corecte
sintactic şi în acord cu convenţiile:

String 1stUserName;
int bdt; //date of birthday
float o1; //first operand
 */

public class Homework07
{
    public static void main(String[] args)
    {
        String firstUserName = "avcuteanu"; //username
        int birthDate = 4/15/2000; //date of birthday
        float operand1 = 4.1243534F; // first operand

        System.out.println("Username is: " + firstUserName);
        System.out.printf("Birthday is %d%nFirst operand id %.2f",birthDate,operand1);
    }
}
