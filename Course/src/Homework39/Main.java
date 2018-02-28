package Homework39;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        String tmpLine;
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\acuteanu\\IdeaProjects\\AndreiCuteanu\\Course\\src\\Homework39\\thirdFile.txt"));
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\acuteanu\\IdeaProjects\\AndreiCuteanu\\Course\\src\\Homework39\\firstFile.txt"));
        while((tmpLine=br.readLine())!=null)
            bw.write(tmpLine+"\n");
        br.close();
        br = new BufferedReader(new FileReader("C:\\Users\\acuteanu\\IdeaProjects\\AndreiCuteanu\\Course\\src\\Homework39\\secondFile.txt"));
        while((tmpLine=br.readLine())!=null)
            bw.write(tmpLine);
        br.close();
        bw.close();
    }
}
