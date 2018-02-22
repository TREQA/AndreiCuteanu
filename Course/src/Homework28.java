public class Homework28 {
    public static void main(String[] args){
        String[] texts = {"Optimum pH of your water is between 6.0 and 7.0. However Oscars are okay in a pH up to 8.0.",
                "The Oscar fish is not a difficult fish to look after if you give it a suitable environment to live in. You may start having problems such as health issues if you keep your Oscar in an unsuita bly small tank or feed it on a poor diet",
                "The Oscar has the potential to reach 18 inches. However in captivity Oscars normally grow to between 8 and 12 inches"};
        for (int o=0; o<texts.length; o++) {
            if (texts[o].length() > 25) {
                String tmpTxt = texts[o].substring(0, 22);
                tmpTxt = tmpTxt.concat("...");
                System.out.println(tmpTxt);
            }
        }
    }
}
