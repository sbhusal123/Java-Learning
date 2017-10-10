package FileWriter;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class NewClass {

    public static void main(String[] args) {

        String filename;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the filename to create:");

        filename = scan.next();

        try {

            File file = new File(filename);

            if (file.exists()) {
                file.createNewFile();
            }

            PrintWriter pr = new PrintWriter(file);

            pr.println("This is the content of my file");

            pr.println(1000);

            pr.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
