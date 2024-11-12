import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User creator = new User(1, "Alice", "alice@example.com");
        TaskManager taskManager = new TaskManager();

        Task featureTask = taskManager.createTask("Implement Login", TaskType.FEATURE, creator);
        Task bugTask = taskManager.createTask("Fix crash issue", TaskType.BUG, creator);

        SprintManager sprintManager = new SprintManager();
        Sprint sprint = sprintManager.createSprint("Sprint 1", LocalDate.now(), LocalDate.now().plusWeeks(2));
        sprintManager.addTaskToSprint(sprint.getId(), featureTask);
        sprintManager.addTaskToSprint(sprint.getId(), bugTask);

        System.out.println("Sprint created with tasks.");
    }
}
