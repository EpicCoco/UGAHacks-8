import java.util.ArrayList;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Log extends VBox {
    ArrayList<Quest> quests;
    
    public Log() {
        super();
        quests = new ArrayList<Quest>();
        //Text logText = new Text("Log:");
        this.getChildren().add(new Text("Log:"));
        
    } //Log

    public void addQuest(Quest quest) {
        quests.add(quest);
        this.getChildren().addAll(quest);
    } //addQuest

    public ArrayList<Quest> getQuests() {
        return quests;
    } //getQuests
    

    public String toString() {
        String toReturn = "";
        for(Quest q : quests) {
            toReturn += q.toString();
        } //for
        return toReturn;
    } //toString

} //Log
