import java.util.ArrayList;

import javafx.scene.layout.VBox;

public class Quest extends VBox {
    
    ArrayList<Task> tasks;
    ArrayList<Reward> rewards;

    public Quest() {
        super();
        tasks = new ArrayList<Task>();
        rewards = new ArrayList<Reward>();
    } //Quest

    public Quest(Task task) {
        super();
        tasks = new ArrayList<Task>();
        rewards = new ArrayList<Reward>();
        tasks.add();
    } //Quest
    public void addTask(Task task) {
        tasks.add(task);
        this.getChildren().add(task);
    } //addTask

    public boolean isAllCompeleted() {
        for(int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).isDone() == false) {
                return false;
            } //if
        }//for
        return true;
    }//isAllCompleted

    public ArrayList<Task> getTasks() {
        return tasks;
    } //getTasks

    public String toString() {
        String toReturn = "";
        for(Task t : tasks) {
            toReturn += t.toString();
        } //for
        return toReturn;
    } //toString
} //Quest
