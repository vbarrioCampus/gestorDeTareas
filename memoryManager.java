import java.util.*;

class memoryManager {
    static Scanner scan = new Scanner(System.in);

    /**
     * Add a new task to the List
     * 
     * @param aTask - List<String> to add a new Task
     * @return List<String>
     */
    static List<String> addTask(List<String> aTask) {
        String newTask;
        System.out.println("Introduce la nueva tarea:");
        newTask = scan.nextLine();
        if (newTask != "") {
            aTask.add(newTask);
            System.out.println("Añadido correctamente.");
        }
        return (aTask);
    }

    /**
     * Modify a task on the List
     * 
     * @param aTask - List<String> to modify a task
     * @return List<String>
     */
    static List<String> modTask(List<String> aTask) {
        System.out.println("Introduce el indice de la tarea a modificar:");
        int index = scan.nextInt();
        System.out.println("Introduce la tarea");
        String newTask = scan.next();
        if (newTask != "") {
            aTask.set(index - 1, newTask);
            System.out.println("Editado correctamente.");
        }
        return (aTask);
    }

    /**
     * Delete a task on the List
     * 
     * @param aTask - List<String> to delete a task
     * @return List<String>
     */
    static List<String> deleteTask(List<String> aTask) {
        int index;
        System.out.println("¿Que tarea(indice) desea eliminar?");
        index = scan.nextInt();
        try {
            aTask.remove(index - 1);
            System.out.println("Tarea " + index + " correctamente eliminada.");
        } catch (Exception e) {
        }
        return (aTask);

    }
}
