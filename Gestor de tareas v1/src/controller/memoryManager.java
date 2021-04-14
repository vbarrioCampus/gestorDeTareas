package controller;

import java.util.*;

public class memoryManager {

    static List<String> addTask(List<String> aTask) {
        Scanner sc = new Scanner(System.in);
        String newTask;
        System.out.println("Introduce la nueva tarea:");
        newTask = sc.nextLine();
        if (newTask != "") {
            aTask.add(newTask);
            System.out.println("Añadido correctamente.");
        }
        sc.close();
        return (aTask);
    }

    static List<String> modTask(List<String> aTask) {
        Scanner sc = new Scanner(System.in);
        String index;
        String newTask;
        System.out.println("Introduce el indice de la tarea a modificar:");
        index = sc.nextLine();
        System.out.println("Introduce la tarea");
        newTask = sc.nextLine();
        if (newTask != "") {
            aTask.set(Integer.parseInt(index) - 1, newTask);
            System.out.println("Editado correctamente.");
        }
        sc.close();
        return (aTask);
    }

    static List<String> deleteTask(List<String> aTask) {
        Scanner sc = new Scanner(System.in);
        String index;
        System.out.println("¿Que tarea(indice) desea eliminar?");
        index = sc.nextLine();
        try {
            aTask.remove(Integer.parseInt(index) - 1);
            System.out.println("Tarea " + index + " correctamente eliminada.");
        } catch (Exception e) {
        }
        sc.close();
        return (aTask);

    }
}
