/* Exercitiul 1 - CJPR04:
Trebuie să păstrăm în program anii de muncă și salariul unui angajat.
Sarcina dvs. este să declarați variabilele care se pot utiliza în acest
scop.
*/
public class Homework05 {
    public Homework05() {

    }
        public static void main(String[] args) {
            String employee = "Andrei Cuteanu";
            int years = 3;
            double year1salary = 10000.15;
            double year2salary = 15000.21;
            double year3salary = 20000.56;
            double salary = (year1salary + year2salary + year3salary);

            System.out.println("Employee Name: " + employee);
            System.out.println("Years: " + years);
            System.out.println("Salary: " + salary);
        }

} 
