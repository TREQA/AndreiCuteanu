package Homework38;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\acuteanu\\Desktop\\users.txt"));
        String line;
        while((line=br.readLine())!=null)
        {
            String[] user = line.split("\\|");
            System.out.println("User ID: " + user[0].split("\\:")[1]);
            System.out.println("First Name: " + user[1].split("\\:")[1]);
            System.out.println("Last name: " + user[2].split("\\:")[1]);
            System.out.println("Jmbg: " + user[3].split("\\:")[1]);
            System.out.println("------------------------------------");
        }
        br.close();
    }
}