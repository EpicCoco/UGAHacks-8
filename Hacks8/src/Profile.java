import javafx.scene.layout.VBox;

public class Profile extends VBox {
    
    Log log;

    public Profile() {
        super();
        log = new Log();
        this.getChildren().addAll();
    } //Profile

    void addQuest(Quest quest) {
        this.getChildren().add(quest);

    } //addQuest

} //Profile
