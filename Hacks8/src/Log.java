import java.util.ArrayList;

public class Log {
    ArrayList<Quest> quests = new ArrayList<Quest>();

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
