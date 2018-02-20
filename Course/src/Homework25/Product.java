package Homework25;

//Clasa Produs
public abstract class Product {
    //Declararea variabilelor
    public int type;
    public String name;
    public double price;
    public String[] addons;
    public abstract double countPrice();

    //Suprascrierea metodei toString
    @Override
    public String toString() {
//Fiindcă se execută concatenarea stringului, cea mai eficientă variantă este folosirea clasei StringBuilder
        StringBuilder output = new StringBuilder();
//Se adaugă date despre produs. this.name va fi atribuită constructorului.
//De asemenea, şi preţul va fi atribuit în constructor, însă acesta nu se scrie direct,
//ci se procesează prim metoda calculare preţ
//(această metodă va fi scrisă mai târziu la nivelul clasei copil,
//deoarece fiecare clasă copil are propria cotă de impozitare)
        output.append("Product: ");
        output.append(this.name + ". ");
        output.append("Price: " + countPrice() + ". ");
        output.append("Addons: " + allAddons());
        return output.toString();
    }
    //metoda pentru afişarea tuturor adaosurilor
    public String allAddons()
    {
//şi în acest caz va exista probabil concatenarea stringurilor, aşadar se foloseşte StringBuilder
        StringBuilder output = new StringBuilder();
//se trece prin lista de adaosuri, folosind bucla for. Atâta timp cât membrul listei nu este null,
//variabilei ieşire i se adaugă membrul listei cu un semn adăugat,
        for(int i=0;i<this.addons.length;i++)
            if(this.addons[i]!=null)
                output.append(this.addons[i] + "; ");
//la sfârşit trebuie eliminată ultima virgulă şi dacă nu există adaosuri, scrieţi mesajul: fără adaosuri
        if(!output.toString().equals(""))
        {
            if(output.toString().trim().endsWith(";"))
                output.replace(output.length()-2, output.length(), ".");
        }
        else
            output.append("no addons");
        return output.toString();
    }
    public void addon(String addon) {
//se trece prin lista de adaosuri, până la primul membru inexistent (null).
//În membrul inexistent se introduce o valoare şi se întrerupe bucla
        for(int i=0;i<this.addons.length;i++)
            if(this.addons[i]==null)
            {
                this.addons[i]=addon;
                break;
            }
    }
}