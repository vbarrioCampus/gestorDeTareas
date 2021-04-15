import java.util.*;

class view {
    static Scanner scan = new Scanner(System.in);

    /**
     * Show the interface
     * 
     * @param aTask - List<String> to show
     * @return List<String>
     */
    static List<String> mainView(List<String> aTask) {
        int option = 0;
        while (option != 4) {
            // Show Task List
            System.out.println("Lista de tareas\n---------------------------");
            if (aTask.size() != 0) {
                int count = 1;
                for (String task : aTask) {
                    System.out.println(count + " - " + task);
                    count++;
                }
            } else {
                System.out.println("No tienes tareas pendientes");
            }
            System.out.println("---------------------------");
            // Show Options
            System.out.println(
                    "Introduzca una opción:\n\t1. Añadir tarea\n\t2. Modificar tarea\n\t3. Eliminar tarea\n\t4. Salir");
            // Select option
            option = scan.nextInt();
            switch (option) {
            // Add Task
            case 1:
                aTask = memoryManager.addTask(aTask);
                break;
            // Modify Task
            case 2:
                aTask = memoryManager.modTask(aTask);
                break;
            // Delete Task
            case 3:
                aTask = memoryManager.deleteTask(aTask);
                break;

            default:
            }
        }
        return (aTask);
    }
}
