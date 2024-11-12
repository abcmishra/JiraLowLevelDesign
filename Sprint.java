import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private  int id;
    private String name;
    private LocalDate startDtae;
    private LocalDate endDate;
    private List<Task> taskList;

    public Sprint(int id,String name,LocalDate startDtae,LocalDate endDate){
        this.id=id;
        this.name=name;
        this.startDtae=startDtae;
        this.endDate=endDate;
        this.taskList= new ArrayList<>();

    }

    public void addTask(Task task){
        taskList.add(task);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDtae() {
        return startDtae;
    }

    public void setStartDtae(LocalDate startDtae) {
        this.startDtae = startDtae;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
