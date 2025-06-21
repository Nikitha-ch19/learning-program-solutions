public class TaskList {
    private Task head;

    public void addTask(Task newTask) {
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTask;
        }
    }

    public Task searchTask(String id) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId.equals(id)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void deleteTask(String id) {
        if (head == null) return;
        if (head.taskId.equals(id)) {
            head = head.next;
            System.out.println("Task " + id + " deleted.");
            return;
        }

        Task prev = head, curr = head.next;
        while (curr != null) {
            if (curr.taskId.equals(id)) {
                prev.next = curr.next;
                System.out.println("Task " + id + " deleted.");
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Task not found.");
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
