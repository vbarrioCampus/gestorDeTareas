import java.util.*;

public class view {
    /**
     * Show the interface
     * 
     * @param aTask - List<String> to show
     * @return Integer Choosed option
     */
    int mainView(List<String> aTask) {
        // Show ArrayList
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
                "Introduzca una opción:\n\t1. Añadir tarea\n\t2. Modificar tarea\n\t3. Eliminar tarea\n\t4. Salir\n\tIntro para actualizar");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        scan.close();
        return (option);
    }
}
