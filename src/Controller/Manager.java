/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Manager {
    public int countWordInFile(String fileSource, String word) throws Exception {
        int count = 0;
        File file = new File(fileSource);

        if (file.exists() && file.isFile()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    for (String w : words) {
                        if (w.equals(word)) {
                            count++;
                        }
                    }
                }
            }
        } else {
            throw new Exception("File not found.");
        }

        return count;
    }

    public List<String> searchFileName(String source, String word) throws Exception {
        List<String> foundFiles = new ArrayList<>();
        File directory = new File(source);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                            String line;
                            while ((line = reader.readLine()) != null) {
                                if (line.contains(word)) {
                                    foundFiles.add(file.getName());
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            throw new Exception("Directory not found.");
        }

        return foundFiles;
    }
}
