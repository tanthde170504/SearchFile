/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.Manager;
import View.Display;
import java.util.List;

/**
 *
 * @author DELL
 */
public class FileSearch {
    private Manager search;
    private Display display;

    public FileSearch(Manager search, Display display) {
        this.search = search;
        this.display = display;
    }

public void run() {
        while (true) {
            int choice = display.getMenuChoice();

            switch (choice) {
                case 1:
                    System.out.println("-------- Count Word --------");
                    String fileSource = display.getInputString("Enter path:");
                    String word = display.getInputString("Enter Word: ");
                    try {
                        int count = search.countWordInFile(fileSource, word);
                        display.displayResult("Count: " + count);
                    } catch (Exception e) {
                        display.displayResult(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("-------- Find File By Word --------");
                    String directory = display.getInputString("Enter Path: ");
                    word = display.getInputString("Enter Word: ");
                    try {
                        List<String> foundFiles = search.searchFileName(directory, word);
                        if (foundFiles.isEmpty()) {
                            display.displayResult("No files contain the word.");
                        } else {
                            display.displayResult("Files name: " + foundFiles);
                        }
                    } catch (Exception e) {
                        display.displayResult(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    return;
            }
        }
    }
}



