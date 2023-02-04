import java.util.ArrayList;
import javafx.scene.layout.VBox;

public class Log extends VBox {
    ArrayList<Quest> quests;
    
    public Log() {
        super();
        quests = new ArrayList<Quest>();
    } //Log

    public void addQuest(Quest quest) {
        quests.add(quest);
    } //addQuest

    public String toString() {
        String toReturn = "";
        for(Quest q : quests) {
            toReturn += q.toString();
        } //for
        return toReturn;
    } //toString

} //Log
