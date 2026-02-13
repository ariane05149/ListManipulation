public class Main {
    public static void main(String[] args) {
        TaskManager Manage=new TaskManager();
        try {
            Manage.addTask("Do homework");
            Manage.addTask("Buy groceries");
            Manage.addTask("prepare presentation");
           Manage.displayTasks();
            Manage.sortTask();
            Manage.displayTasks();
            Manage.searchTask("Buy groceries");
            Manage.searchTask("Go jogging");
            Manage.findLongestTask();
            Manage.getTaskByIndex(1);
            Manage.getTaskByIndex(10);
            Manage.removeTask("Buy groceries");
            Manage.displayTasks();
        }
        catch (InvalidTaskException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Execution completed");
        }
        }
    }