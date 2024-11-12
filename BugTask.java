import javax.lang.model.SourceVersion;

public class BugTask extends Task {
    private Severity severity;
    private TaskType taskType;
    public BugTask(int id, String title, User creator, Severity severity){
        super(id,title,creator);
        this.severity=severity;
        this.taskType=TaskType.BUG;

    }
}
