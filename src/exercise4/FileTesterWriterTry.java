package exercise4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileTesterWriterTry {
    public static void main(String[] args) {
        String fileName = "testFile2.txt";

        try(
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                ) {

            bufferedWriter.write("Bolek");
            bufferedWriter.newLine();
            bufferedWriter.write("Lolek");
        } catch (IOException e) {
            System.err.println("Błąd wejścia/wyjścia");
        }
    }
}
