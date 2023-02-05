import java.util.ArrayList;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Separator;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Log extends Tab {
    ArrayList<Quest> quests;
    VBox content;
    Separator separator = new Separator(Orientation.HORIZONTAL);
        
    public Log() {
        this.setText("Log");
        quests = new ArrayList<Quest>();
        initLog();
        
    } //Log

    public void initLog() {
        content = new VBox();
        //Text logText = new Text("Log:");
        content.getChildren().add((new Text("Log:")));
        this.setContent(content);
    } //initLog

    public void addQuest(Quest quest) {
        quests.add(quest);
        content.getChildren().addAll(separator, quest);
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
