import java.util.ArrayList;
import java.util.List;

public class User  implements  Observer{
    private int id;
    private String name;
    private String email;
    private List<Task> assignTasks;

    public User(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
        this.assignTasks= new ArrayList<>();
    }




    @Override
    public void update(Task task) {
        System.out.println("Notification: Task " + task.getTitle() + " has been updated.");
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Task> getAssignTasks() {
        return assignTasks;
    }

    public void setAssignTasks(List<Task> assignTasks) {
        this.assignTasks = assignTasks;
    }
}
