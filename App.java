import java.util.*;

class App {
    public static void main(String[] args) {
        storageManager storage = new storageManager();
        memoryManager memory = new memoryManager();
        view mainInterface = new view();
        boolean exit = false;
        int option;
        String root = "Tareas.txt";
        List<String> aTask = new ArrayList<String>();
        // File exist if not create
        storage.setFile(root);
        // Get Tasks List
        aTask = storage.getFileTask(root);

        while (!exit) {
            // Show Task List
            option = mainInterface.mainView(aTask);
            switch (option) {
            // Add Task
            case 1:
                aTask = memory.addTask(aTask);
                break;
            // Modify Task
            case 2:
                aTask = memory.modTask(aTask);
                break;
            // Delete Task
            case 3:
                aTask = memory.deleteTask(aTask);
                break;
            // Save to file and Exit
            case 4:
                storage.saveData(aTask, root);
                exit = true;
                System.out.println("Guardado y Cerrado");
                break;
            default:
            }
        }

    }
}
