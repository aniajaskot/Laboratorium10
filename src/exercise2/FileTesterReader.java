package exercise2;

import java.io.*;

public class FileTesterReader {
    public static void main(String[] args) {
        String fileName = "testFile.txt";

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            int lines = 0;
            String nextLine = null;
            while((nextLine = bufferedReader.readLine()) != null){
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilość wierszy w pliku: " + lines);
        } catch (java.io.IOException e) {
            System.err.println("Bład wejścia/wyjścia");
        } finally {
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.err.println("Bład wejścia/wyjścia");
                }
            }
        }
    }
}
