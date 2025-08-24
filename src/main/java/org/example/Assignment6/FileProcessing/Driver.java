package org.example.Assignment6.FileProcessing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) {
        String filename = "customers.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                if (parts.length != 2) {
                    System.out.printf("Line %d malformed (expected 'Name,balance'): %s%n", lineNumber, line);
                    continue;
                }

                String name = parts[0].trim();
                String balanceText = parts[1].trim();


                try {
                    double balance = Double.parseDouble(balanceText);
                    System.out.printf("Customer: %s, Balance: $%.2f%n", name, balance);
                } catch (NumberFormatException nfe) {
                    System.out.printf("Line %d: invalid balance for '%s' -> '%s'%n", lineNumber, name, balanceText);

                }
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + filename);
        } catch (IOException ioe) {
            System.out.println("Error reading file: " + ioe.getMessage());
        }
    }
}
