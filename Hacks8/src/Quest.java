import java.util.ArrayList;

import javafx.scene.layout.VBox;

public class Quest extends VBox {
    
    ArrayList<Task> tasks = new ArrayList<Task>();
    ArrayList<Reward> rewards = new ArrayList<Reward>();

    public Quest() {
        super();
        
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

    public String toString() {
        String toReturn = "";
        for(Task t : tasks) {
            toReturn += t.toString();
        } //for
        return toReturn;

    } //toString
}
