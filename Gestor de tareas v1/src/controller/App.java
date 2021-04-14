package controller;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        boolean exit = false;
        String root = "Tareas.txt";
        List<String> aTask = new ArrayList<String>();
        // File exist??
        storageManager.setFile(root);
        // Get and show Tasks List
        aTask = storageManager.getFileTask(root);

        while (!exit) {
            // Show Task List
            view.mainView(aTask);
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            switch (option) {
            // Add Task
            case "1":
                aTask = memoryManager.addTask(aTask);
                break;
            // Modify Task
            case "2":
                aTask = memoryManager.modTask(aTask);
                break;
            // Delete Task
            case "3":
                aTask = memoryManager.deleteTask(aTask);
                break;
            // Save to file and Exit
            case "4":
                storageManager.saveData(aTask, root);
                exit = true;
                sc.close();
                System.out.println("Guardado y Cerrado");
                break;
            default:
            }
        }

    }
}
