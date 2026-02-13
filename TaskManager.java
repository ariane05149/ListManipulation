import java.util.*;
public class TaskManager {
    private ArrayList<String> arrayTasks;
    private LinkedList<String> linkedTasks;
    public TaskManager() {
        arrayTasks = new ArrayList<>();
        linkedTasks = new LinkedList<>();
    }
    public void addTask(String task) throws InvalidTaskException {

        if (task == null || task.trim().isEmpty()) {
            throw new InvalidTaskException("Invalid task");
        }

        arrayTasks.add(task);
        linkedTasks.add(task);

        System.out.println("Task added successfully");
    }
    public void sortTask() {
        Collections.sort(arrayTasks);
        Collections.sort(linkedTasks);
        System.out.println("Tasks are alphabetically sorted");
    }
    public void searchTask(String task) {

        int index = arrayTasks.indexOf(task);

        if (index != -1) {
            System.out.println("Task found at index: " + index);
        } else {
            System.out.println("Task not found");
        }
    }
    public void removeTask(String task) {

        if (arrayTasks.remove(task)) {
            linkedTasks.remove(task);
            System.out.println("Task removed");
        } else {
            System.out.println("Task not found");
        }
    }
    public void findLongestTask() {

        if (arrayTasks.isEmpty()) {
            System.out.println("Empty task list");
            return;
        }

        String longest = arrayTasks.get(0);

        for (String task : arrayTasks) {
            if (task.length() > longest.length()) {
                longest = task;
            }
        }

        System.out.println("Longest task: " + longest);
    }
    public void getTaskByIndex(int index) {

        try {
            String task = arrayTasks.get(index);
            System.out.println("Task at index " + index + ": " + task);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of range!");
        }
    }
    public void displayTasks() {
        System.out.println("Current Tasks: " + arrayTasks);
    }
}
