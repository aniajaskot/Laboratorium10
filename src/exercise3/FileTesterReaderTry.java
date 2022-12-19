package exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTesterReaderTry {
    public static void main(String[] args) {
        String fileName = "testFile.txt";

        try(FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ) {

            int lines = 0;
            String nextLine = null;
            while((nextLine = bufferedReader.readLine()) != null){
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilość wierszy w pliku: " + lines);
        } catch (IOException e) {
            System.err.println("Bład wejścia/wyjścia");
        }
    }
}
