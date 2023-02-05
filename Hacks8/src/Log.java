import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Separator;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Log extends Tab {
    ArrayList<Quest> quests;
    VBox content;
    Separator separator = new Separator(Orientation.HORIZONTAL);
    Insets insets25 = new Insets(10, 20, 10, 20);

    UserProfile userProfile;
    Image logProfile;
    Image recOne;
    Image recTwo;
    Image recThree;
        

    /**
     * Log for the quests a user has.
     * @param userProfile
     */
    public Log(UserProfile userProfile) {
        //this.userProfile = userProfile;
        this.setText("Log");
        quests = new ArrayList<Quest>();
        //initLog();

        Image log;
        content = new VBox();
        content.setPadding(insets25);
        log = new Image("file:Resources\\Log.png");
        ImageView mapView = new ImageView(log);
        BorderPane pane = new BorderPane();
        pane.setPrefSize(400, 300);
        pane.setCenter(mapView);
        mapView.setFitHeight(650);
        mapView.setFitWidth(410);
        content.getChildren().add(mapView);
        this.setContent(content);
        
    } //Log

    /**
     * Initialize Log with the resources.
     */
    public void initLog() {
        content = new VBox();
        //Text logText = new Text("Log:");
        logProfile = new Image("file:Resources\\Top Gradient.png");
        ImageView logProfileView = new ImageView(logProfile);
        BorderPane proPane = new BorderPane();
        //proPane.setPrefSize(400, 300);
        proPane.setCenter(logProfileView);
        logProfileView.setFitHeight(184);
        logProfileView.setFitWidth(385);
        
        content.getChildren().addAll(userProfile);
        this.setContent(content);
    } //initLog

    /**
     * Add a new quest to the quest log.
     * @param quest
     */
    public void addQuest(Quest quest) {
        quests.add(quest);
        content.getChildren().addAll(separator, quest);
    } //addQuest

    /**
     * Getter method for the list of quests.
     * @return
     */
    public ArrayList<Quest> getQuests() {
        return quests;
    } //getQuests
    
    @Override
    public String toString() {
        String toReturn = "";
        for(Quest q : quests) {
            toReturn += q.toString();
        } //for
        return toReturn;
    } //toString

} //Log
