public class TaskFactory {
    public static Task createFeatureTask(String title, User creator, int id, ImpactLevel impactLevel) {
        return new FeatureTask.Builder(title, creator)
                .id(id)
                .impactLevel(impactLevel)
                .build();
    }

    public static Task createBugTask(String title, User creator) {
        return new BugTask(title, creator);
    }

    public static Task createStoryTask(String title, User creator) {
        return new StoryTask(title, creator);
    }
}