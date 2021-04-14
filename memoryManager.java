import java.util.*;

public class memoryManager {
    /**
     * Add a new task to the List
     * 
     * @param aTask - List<String> to add a new Task
     * @return List<String>
     */
    List<String> addTask(List<String> aTask) {

        String newTask;
        System.out.println("Introduce la nueva tarea:");
        Scanner scan = new Scanner(System.in);
        newTask = scan.nextLine();
        scan.close();
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
    List<String> modTask(List<String> aTask) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el indice de la tarea a modificar:");
        int index = scan.nextInt();
        System.out.println("Introduce la tarea");
        String newTask = scan.nextLine();
        if (newTask != "") {
            aTask.set(index - 1, newTask);
            System.out.println("Editado correctamente.");
        }
        scan.close();
        return (aTask);
    }

    /**
     * Delete a task on the List
     * 
     * @param aTask - List<String> to delete a task
     * @return List<String>
     */
    List<String> deleteTask(List<String> aTask) {
        Scanner scan = new Scanner(System.in);
        int index;
        System.out.println("¿Que tarea(indice) desea eliminar?");
        index = scan.nextInt();
        try {
            aTask.remove(index - 1);
            System.out.println("Tarea " + index + " correctamente eliminada.");
        } catch (Exception e) {
        }
        scan.close();
        return (aTask);

    }
}
