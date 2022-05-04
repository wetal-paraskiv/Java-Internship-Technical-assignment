package ex2;

import java.io.Serializable;

public class Task implements Serializable {
    private String username;
    private String taskTitle;
    private String taskDescription;

    public Task(String username, String taskTitle, String taskDescription) {
        this.username = username;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
    }

    public String getUsername() {
        return username;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }
}
