package exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTesterScanner {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        File file = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            int lines = 0;

            while(scanner.hasNextLine()){
                String nextLine = scanner.nextLine();
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilość wierszy w pliku: " + lines);
        } catch (FileNotFoundException e) {
            System.err.println("Plik nie został odnaleziony");
        } finally {
            if(scanner != null){
                scanner.close();
            }
        }
    }
}
