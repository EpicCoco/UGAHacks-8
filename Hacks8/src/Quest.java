import java.util.ArrayList;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Quest extends VBox {
    
    String questName;
    ArrayList<Task> tasks;
    ArrayList<Reward> rewards;

    public Quest(String name) {
        super();
        questName = name;
        tasks = new ArrayList<Task>();
        rewards = new ArrayList<Reward>();
        this.getChildren().add(new Text(name));
    } //Quest

    public Quest(String name, Task... task) {
        super();
        questName = name;
        tasks = new ArrayList<Task>();
        rewards = new ArrayList<Reward>();
        this.getChildren().add(new Text(name));
        for (Task t : task) {
            this.addTask(t);
        } //for
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
