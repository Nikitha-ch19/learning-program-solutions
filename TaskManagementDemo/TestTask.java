public class TestTask {
    public static void main(String[] args) {
        TaskList list = new TaskList();

        list.addTask(new Task("T101", "Design Database", "Pending"));
        list.addTask(new Task("T102", "Create UI", "In Progress"));
        list.addTask(new Task("T103", "Integrate APIs", "Not Started"));

        System.out.println("All Tasks:");
        list.displayTasks();

        System.out.println("\nSearching for T102:");
        Task found = list.searchTask("T102");
        System.out.println(found != null ? found : "Not found");

        System.out.println("\nDeleting T101:");
        list.deleteTask("T101");

        System.out.println("\nUpdated Task List:");
        list.displayTasks();
    }
}
