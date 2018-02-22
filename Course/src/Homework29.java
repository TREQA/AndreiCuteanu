public class Homework29 {
    public static void main(String[] args){
        String[] files = { "picture1.jpg", "text1.txt", "picture2.png", "text2.doc", "picture3.gif" };

        for (int f=0;f<files.length;f++){
            if (files[f].endsWith("jpg")){
                System.out.println("File: "+files[f]+" is of jpg type.");
            }
            if (files[f].endsWith("txt")){
                System.out.println("File: "+files[f]+" is of txc type.");
            }
            if (files[f].endsWith("png")){
                System.out.println("File: "+files[f]+" is of png type.");
            }
        }
    }
}
