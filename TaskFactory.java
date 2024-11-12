public class TaskFactory {
    public static Task createTask(int id,String type,String title,User creator,ImpactLevel impactLevel){
        switch (type){
            case "Fature":
                return new FeatureTask(id,title,creator,impactLevel);
            case "Bug":
                return new BugTask(title,creator);
            case "Stroy":
                return new StoryTask(title,creator);
            default:
                throw  new IllegalArgumentException("not a valid Task")
        }

    }
}
