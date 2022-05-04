package ex2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String userName;
    private ArrayList<Task> tasks = new ArrayList<>();

    public User(String fn, String ln, String un) {
        this.firstName = fn;
        this.lastName = ln;
        this.userName = un;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) &&
               Objects.equals(lastName, user.lastName) &&
               Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, userName);
    }

    @Override
    public String toString() {
        return "User{" +
               "FirstName='" + firstName + '\'' +
               ", LastName='" + lastName + '\'' +
               ", number of tasks='" + tasks.size() + '\'' +
               '}';
    }

    public String printTasks() {
        String str = "\t" + this.userName + " tasks:\n";
        str += "Task Title\t\tTask Description\n";
        for (Task task : this.getTasks()) {
            str += "'" + task.getTaskTitle() + "'" + "\t\t" + "'" + task.getTaskDescription() + "'" + "\n";
        }
        return str;
    }
}
