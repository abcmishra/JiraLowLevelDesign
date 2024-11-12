public class SprintManager {
    private Map<Integer, Sprint> sprints = new HashMap<>();

    public Sprint createSprint(String name, LocalDate startDate, LocalDate endDate) {
        int sprintId = sprints.size() + 1;
        Sprint sprint = new Sprint(sprintId, name, startDate, endDate);
        sprints.put(sprintId, sprint);
        return sprint;
    }

    public void addTaskToSprint(int sprintId, Task task) {
        if (sprints.containsKey(sprintId)) {
            sprints.get(sprintId).addTask(task);
        }
    }
}
