import java.util.ArrayList;

public class Quest {
    
    ArrayList<Task> tasks = new ArrayList<Task>();

    public String toString() {
        String toReturn = "";
        for(Task t : tasks) {
            toReturn += t.toString();
        } //for
        return toReturn;

    } //toString
}
