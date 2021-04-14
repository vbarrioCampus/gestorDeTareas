import java.io.*;
import java.util.*;

public class storageManager {

    /**
     * Check if File exists if not create the file
     * 
     * @param root - File´s root
     */
    void setFile(String root) {
        try {
            File file = new File(root);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Archivo creado: " + file.getName());
            }
        } catch (IOException e) {
        }
    }

    /**
     * Returns an ArrayList with the content of the file
     * 
     * @param root - File´s root
     * @return ArrayList<String>
     */
    List<String> getFileTask(String root) {
        List<String> alContent = new ArrayList<String>();
        try {
            File file = new File(root);
            if (file.exists()) {
                Scanner scan = new Scanner(file);
                while (scan.hasNextLine()) {
                    String data = scan.nextLine();
                    alContent.add(data);
                }
                scan.close();
            }

        } catch (IOException e) {
        }
        return (alContent);
    }

    /**
     * Saves task list to the file
     * 
     * @param aTask - List<String> all task
     * @param root  - File´s root
     */
    void saveData(List<String> aTask, String root) {
        try {
            String sTask = "";
            for (String task : aTask) {
                sTask += task + "\n";
            }
            FileWriter myWriter = new FileWriter(root);
            myWriter.write(sTask);
            myWriter.close();
        } catch (IOException e) {
        }
    }
}
