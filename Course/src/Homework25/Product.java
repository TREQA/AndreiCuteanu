package Homework25;

public abstract class Product {
    public int type;
    public String name;
    public double price;
    public String[] addons;
    public abstract double countPrice();

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Product: ");
        output.append(this.name + ". ");
        output.append("Price: " + countPrice() + ". ");
        output.append("Addons: " + allAddons());
        return output.toString();
    }

    public String allAddons()
    {
        StringBuilder output = new StringBuilder();
        for(int i=0;i<this.addons.length;i++)
            if(this.addons[i]!=null)
                output.append(this.addons[i] + "; ");
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
        for(int i=0;i<this.addons.length;i++)
            if(this.addons[i]==null)
            {
                this.addons[i]=addon;
                break;
            }
    }
}