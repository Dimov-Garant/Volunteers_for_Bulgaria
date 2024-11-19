package com.example.directdemocracy;

import com.example.directdemocracy.controller.ReferendumController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReferendumController referendumController = new ReferendumController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Direct Democracy App");
        System.out.println("1. List Referendums");
        System.out.println("2. Create a Referendum");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                referendumController.getReferendums().forEach(referendum ->
                        System.out.println("Referendum: " + referendum.getTitle()));
                break;
            case 2:
                System.out.print("Enter Title: ");
                String title = scanner.nextLine();
                System.out.print("Enter Description: ");
                String description = scanner.nextLine();
                referendumController.createReferendum(title, description);
                System.out.println("Referendum Created!");
                break;
            default:
                System.out.println("Invalid Option");
        }

        scanner.close();
    }
}
