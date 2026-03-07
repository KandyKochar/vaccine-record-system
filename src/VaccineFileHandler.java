import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class VaccineFileHandler {

   
    public void readFromFile(String fileName) {

        System.out.println("\nReading Records From: " + fileName);

        try {

            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

           
            fileScanner.useDelimiter(",\\s*|\\n");

            while (fileScanner.hasNext()) {

                String name = fileScanner.next().trim();
                String vaccine = fileScanner.next().trim();

                
                int doses = Integer.parseInt(fileScanner.next().trim());

                System.out.println(
                        "Name: " + name +
                        " | Vaccine: " + vaccine +
                        " | Doses: " + doses);
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {

            System.out.println("Error: File not found -> " + fileName);

        } catch (Exception e) {

    
            System.out.println("Error: File format is incorrect.");
        }
    }

    public void writeToFile(String outputFileName) {

        try {

            Scanner input = new Scanner(System.in);
            PrintWriter writer = new PrintWriter(outputFileName);

            System.out.print("\nHow many records do you want to add? ");
            int n = input.nextInt();
            input.nextLine(); // clear buffer

            for (int i = 1; i <= n; i++) {

                System.out.println("\nRecord #" + i);

                System.out.print("Enter name: ");
                String name = input.nextLine();

                System.out.print("Enter vaccine type: ");
                String vaccine = input.nextLine();
                
                

                  System.out.print("Enter number of doses: ");
                int doses = input.nextInt();
                input.nextLine(); // clear buffer

                writer.println(name + ", " + vaccine + ", " + doses);
            }

            writer.close();

            System.out.println("\nRecords saved successfully!");

        } catch (FileNotFoundException e) {

            System.out.println("Error writing to file.");
        }
    }
    
    
}
