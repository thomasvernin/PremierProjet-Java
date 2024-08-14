// src/com/premierprojet/main/Main.java
package com.premierprojet;

import com.premierprojet.manager.TaskManager;
import com.premierprojet.model.Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Marquer une tâche comme complétée");
            System.out.println("3. Afficher les tâches");
            System.out.println("4. Quitter");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consomme le retour à la ligne

            switch (choice) {
                case 1:
                    System.out.print("Entrez la description de la tâche : ");
                    String description = scanner.nextLine();
                    manager.addTask(new Task(description));
                    break;
                case 2:
                    manager.displayTasks();
                    System.out.print("Entrez le numéro de la tâche à marquer comme complétée : ");
                    int index = scanner.nextInt();
                    manager.markTaskAsCompleted(index);
                    break;
                case 3:
                    manager.displayTasks();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return; // Quitte le programme
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}


