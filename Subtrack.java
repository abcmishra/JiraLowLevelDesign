public class Subtrack{
    private int id;
    private String title;
    private TaskStatus taskStatus;
    public Subtrack(int id,String title,TaskStatus taskStatus){
        this.id=id;
        this.title=title;
        this.taskStatus=TaskStatus.OPEN;
    }
    public  void updateStatus(TaskStatus status){
        this.taskStatus=status;
    }

}
