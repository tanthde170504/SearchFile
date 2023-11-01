/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Display {
    public int getMenuChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Count word in file.");
        System.out.println("2. Find file by word.");
        System.out.println("3. Exit");

        int choice;
        do {
            System.out.print("Select an option: ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 3);

        return choice;
    }

    public String getInputString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + ": ");
        return scanner.next();
    }

    public void displayResult(String result) {
        System.out.println(result);
    }
}
