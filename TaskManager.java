public class TaskManager{
    private static TaskManager instance;
    private TaskManger(){

    }
    public static TaskManager getInstance(){
        if(instance==null){
            synchronized (TaskManager.class){
                if(instance==null){
                    instance= new TaskManager();
                }
            }
        }
        return  instance;
    }

}