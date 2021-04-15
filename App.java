import java.util.*;

class App {
    public static void main(String[] args) {
        String root = "Tareas.txt";
        List<String> aTask = new ArrayList<String>();
        // File exist if not create
        storageManager.setFile(root);
        // Get Tasks List
        aTask = storageManager.getFileTask(root);
        // Main Interface
        aTask = view.mainView(aTask);
        // Save to file and Exit
        storageManager.saveData(aTask, root);
    }
}
