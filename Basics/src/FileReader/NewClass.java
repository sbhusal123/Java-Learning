package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) throws IOException {
        
        String filename;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the name of file you want to open: ");
        filename = scan.next();
        
        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();
        }
        
        catch (IOException e) {
            System.out.println(e);
        }

    }

}
