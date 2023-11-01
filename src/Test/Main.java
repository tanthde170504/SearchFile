/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Model.FileSearch;
import Controller.Manager;
import View.Display;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Manager search = new Manager();
        Display display = new Display();
        FileSearch controller = new FileSearch(search, display);
        controller.run();
    }
}
