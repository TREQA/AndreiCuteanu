/*  Curs: Core Java Programming
    Modul: Gestionarea sistemului de fișiere
    Unitate: Fișiere/Foldere
    Exercitiul 1:
Creați un program ce va muta fișierul de pe o cale pe alta (opțiunea
cut).
 */

import java.io.*;

public class Homework41 {

    public static void main(String[]args){
        String path = "";
        String destination= "";

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter file path: ");
            path = bufferedReader.readLine();

            System.out.println("Enter destination folder: ");
            destination = bufferedReader.readLine();
        }
        catch (IOException e){
            System.out.println(e);
        }

        File afile = new File(path);
        File bfile = new File(destination + "\\" + afile.getName());

        try(FileInputStream inStream = new FileInputStream(afile);
            FileOutputStream outStream = new FileOutputStream(bfile);) {
            byte[] buffer = new byte[1024];

            int length;

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }

            System.out.println("File is moved successfuly!");
            inStream.close();
            outStream.close();
            afile.delete();
        }
        catch (IOException exc)
        {
            System.out.println(exc);
        }

    }
}
