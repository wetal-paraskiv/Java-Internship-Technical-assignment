package ex2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class myaplication {
    public static void main(String[] args) {
        createUser("Vitalie", "Paraschiv", "wetal");
    }
    public static void createUser(String fn, String ln, String un) {
        String filePath = "data.txt";
        User user = new User(fn, ln, un);

        // serialization
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user);

            System.out.println("object was serialized and saved to file.");
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
