/* Curs: Core Java Programming
   Modul: Programarea orientată pe obiecte în Java
   Unitate: Elementele clasei
   Exercitiul 1:

Trebuie creată clasa Calculator (de buzunar) care are trei proprietăţi:
operand1, operand2 şi operator. Clasa posedă metoda calculate() care,
pe baza operatorului, execută operaţia de calcul adecvată asupra
operanzilor şi returnează un rezultat. Sunt suficiente cele 4 operaţii de
bază (+, -, *, / - adunarea, scăderea, înmulţirea şi împărţirea).
Toate valorile sunt de tip double.
*/

public class Homework22 {
    public static void main(String[] Andrei) {

        Homework22 c = new Homework22();
        c. operand1 = 2;
        c. operand2 = 5;
        c. operator = '+';
        System.out.println(c.calculate());
    }

    public double operand1;
    public double operand2;
    public char operator;

    public double calculate() {
        double result;
        switch (this.operator) {
            case '+':
                result = this.operand1 + this.operand2;
                break;
            case '-':
                result = this.operand1 - this.operand2;
                break;
            case '*':
                result = this.operand1 * this.operand2;
                break;
            case '/':
                if (this.operand2 == 0) {
                    System.out.println("Impartirea nu este posibila!");
                    result = 0;
                } else
                    result = this.operand1 / this.operand2;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    } 
} 
