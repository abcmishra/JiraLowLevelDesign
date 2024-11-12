import java.util.ArrayList;

public class StoryTask extends Task{
    private String storySummary;
    private List<SubTrack> subTrackList;
    private TaskType type;

    public StoryTask(int id,User creator,String title ,String storySummary){
      super(id,title,creator);
      this.type=TaskType.STORY;
      this.storySummary=storySummary;
      this.subTrackList = new ArrayList<>();

    }

    public void addSubtrack(Subtrack subtrack){
        subTrackList.add(subtrack)

    }
}
