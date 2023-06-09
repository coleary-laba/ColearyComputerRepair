public class Worker {
    public String workId;
    protected String name;
    protected Task task;

    public Worker(String newName, String newWorkId, Task newTask) {
        name = newName;
        workId = newWorkId;
        task = newTask;
    }

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task newTask) {
        task = newTask;
    }
}
