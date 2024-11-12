public class TaskManager {
    private Map<Integer, Task> tasks = new HashMap<>();

    public Task createTask(String title, TaskType type, User creator) {
        Task task;
        int taskId = tasks.size() + 1;
        switch (type) {
            case FEATURE:
                task = new FeatureTask(taskId, title, creator, "Feature summary", ImpactLevel.HIGH);
                break;
            case BUG:
                task = new BugTask(taskId, title, creator, Severity.P1);
                break;
            case STORY:
                task = new StoryTask(taskId, title, creator, "Story summary");
                break;
            default:
                throw new IllegalArgumentException("Invalid task type");
        }
        tasks.put(taskId, task);
        return task;
    }

    public void updateTaskStatus(int taskId, TaskStatus status) {
        if (tasks.containsKey(taskId)) {
            tasks.get(taskId).updateStatus(status);
        }
    }
}
