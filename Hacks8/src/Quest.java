import java.util.ArrayList;

public class Quest {
    
    ArrayList<Task> tasks = new ArrayList<Task>();
    ArrayList<Reward> rewards = new ArrayList<Reward>();

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
