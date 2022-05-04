package ex2;

import java.io.*;
import java.util.ArrayList;

public class myapplication {
    static final String filePath = "C:\\Users\\mihai\\IdeaProjects\\Stefanini\\src\\ex2\\data.txt";
    static myapplication app = new myapplication();

    public static void main(String[] args) {
        switch (args[0]) {
            case "-createUser": {
                app.createUser(args[1].substring(4), args[2].substring(4), args[3].substring(4));
                break;
            }
            case "-showAllUsers": {
                app.showAllUsers();
                break;
            }
            case "-addTask": {
                app.addTask(args[1].substring(4), args[2].substring(4), args[3].substring(4));
                break;
            }
            case "-showTasks": {
                app.showTasks(args[1].substring(4));
                break;
            }
            default: {
                System.out.println("Unknown method name!");
                break;
            }
        }
    }

    public void createUser(String fn, String ln, String un) {
        User newUser = new User(fn, ln, un);
        var users = new ArrayList<>(deserializeData());
        if (!users.contains(newUser))
            users.add(new User(fn, ln, un));

        serializeData(users);
    }

    public void showAllUsers() {
        ArrayList<User> users = app.deserializeData();
        System.out.println("Users list:\n");
        for (User user : users) {
            System.out.println(user.toString());
        }
        System.out.println();
    }

    public void addTask(String un, String title, String description) {
        Task task = new Task(un, title, description);
        ArrayList<User> users = deserializeData();
        for (User user : users) {
            if (user.getUserName().equals(un))
                user.addTask(task);
        }
        serializeData(users);
    }

    public void showTasks(String un) {
        ArrayList<User> users = app.deserializeData();
        for (User user : users) {
            if (user.getUserName().equals(un)) {
                System.out.println(user.printTasks());
                break;
            }
        }
    }

    public void serializeData(ArrayList<User> users) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(users);

            objectOutputStream.close();
            fileOutputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<User> deserializeData() {
        ArrayList<User> usersList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            usersList = (ArrayList<User>) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        return usersList;
    }

}
