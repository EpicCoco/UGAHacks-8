import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Separator;
import javafx.scene.control.Tab;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Profile extends Tab {

    HBox userProfile;
    VBox profileInfo;
    VBox skillInfo;
    ProgressBar xpBar;
    Image userImage;
    Separator separator = new Separator(Orientation.HORIZONTAL);
    Insets insets25 = new Insets(25, 25, 25, 25);
    GridPane gridPane;

    Image skillOutdoors;

    private Attribute Outdoorsman;
    private Attribute Cultured;
    private Attribute Explorer;
    private Attribute ThrillSeeker;
    private Attribute Foodie;
    private Attribute JackOfAllTrades;
    
    
    public Attribute[] skills = {Outdoorsman, Cultured, Explorer, ThrillSeeker, Foodie, JackOfAllTrades}; 

    public Profile() {
        this.setText("Profile");
        Outdoorsman = new Attribute(0, "Recreation"); 
        Cultured = new Attribute(0, "Arts"); 
        Explorer = new Attribute(0, "Explore"); 
        ThrillSeeker = new Attribute(0, "Entertainment");
        Foodie = new Attribute(0 , "Food"); 
        JackOfAllTrades = new Attribute(0, "Other"); 
        initUserProfile();
    } //Profile

    public void initUserProfile() {
        userProfile = new HBox();
        userProfile.setPadding(insets25);
        userProfile.setAlignment(Pos.CENTER);
        xpBar = new ProgressBar(0);
        userImage = new Image("file:Resources\\profile_picture.jpg");
        ImageView userImageView = new ImageView(userImage);
        userImageView.setFitHeight(100);
        userImageView.setFitWidth(100);
        userProfile.getChildren().addAll(userImageView, xpBar);
        profileInfo = new VBox();
        separator.setPadding(insets25);
        skillInfo = new VBox();
        skillInfo.setPadding(insets25);
        skillInfo.setAlignment(Pos.CENTER);
        gridPane = new GridPane();
        skillOutdoors = new Image("file:Resources\\App Icon.png");
        ImageView outImageView = new ImageView(skillOutdoors);
        

        gridPane.add(outImageView, 0, 0, 2, 2);

        profileInfo.getChildren().addAll(userProfile, separator, skillInfo, gridPane);
        this.setContent(profileInfo);
    } //initUserProfile

    public void gainSkill(Attribute questAttribute) {
         if (questAttribute.name.equalsIgnoreCase("Recreation")) {
                this.Outdoorsman.setWeight(this.Outdoorsman.getWeight() + 1); 
            } else if (questAttribute.name.equalsIgnoreCase("Arts")) {
               this.Cultured.setWeight(this.Cultured.getWeight() + 1); 
            } else if (questAttribute.name.equalsIgnoreCase("Entertainment")) {
                 this.ThrillSeeker.setWeight(this.ThrillSeeker.getWeight() + 1); 
            } else if (questAttribute.name.equalsIgnoreCase("Food")) {
                this.Foodie.setWeight(this.Foodie.getWeight() + 1);
            } else if (questAttribute.name.equalsIgnoreCase("Explore")) {
                this.Explorer.setWeight(this.Explorer.getWeight() + 1);
            } else {
                this.JackOfAllTrades.setWeight(this.JackOfAllTrades.getWeight() + 1);
            }
    }

    public void xpProgress(int progress) {
        xpBar.setProgress(((double)progress)/100);
    } //xpProgress

    public Attribute[] getSkills(){
        return this.skills;
    } //getSkills

    public void printProfileSkills() {
        for (int i = 0; i < this.skills.length; i++) {
            System.out.println(this.skills[i].name);
            System.out.println(this.skills[i].getWeight() ); 
        }
    }

} //Profile
