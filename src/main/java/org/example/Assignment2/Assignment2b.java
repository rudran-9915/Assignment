package org.example.Assignment2;

import java.util.Scanner;

public class Assignment2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(choice!=4){
            System.out.println("Roles");
            System.out.println("1.Admin\n2.Manager\n3.Viewer\n4.Exit");
            System.out.println("Choose your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Admin ->  you can manage users and settings");
                    break;
                case 2:
                    System.out.println("Manager -> you can generate reports and approve requests");
                    break;
                case 3:
                    System.out.println("Viewer -> Read-only access");
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
            System.out.println();
        }
    }
}
