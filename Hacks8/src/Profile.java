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
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;

public class Profile extends Tab {

    HBox userProfile;
    VBox profileInfo;
    VBox skillInfo;
    ProgressBar xpBar;
    Image userImage;
    Separator separator = new Separator(Orientation.HORIZONTAL);
    Insets insets25 = new Insets(10, 20, 10, 20);
    GridPane gridPane;
    ImageView comp;

    Image skillOutdoors;
    Image skillFood;
    Image skillExplorer;
    Image skillEntertainment;
    Image skillCulture;
    Image skillMisc;

    Label skill;
    Label recent;

    Image complete;

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
        userImage = new Image("file:Resources\\Codey profile.png");
        ImageView userImageView = new ImageView(userImage);
        userImageView.setFitHeight(125);
        userImageView.setFitWidth(125);
        userProfile.getChildren().addAll(userImageView, xpBar);
        profileInfo = new VBox();
        separator.setPadding(insets25);
        skillInfo = new VBox();
        //skillInfo.setPadding(insets25);
        skillInfo.setAlignment(Pos.CENTER);

        skill = new Label("Skills");
        skill.setFont(new Font("Arial", 32));
        skill.setPadding(insets25);

        recent = new Label("Recently Completed");
        recent.setFont(new Font("Arial", 32));
        recent.setPadding(insets25);        

        gridPane = new GridPane();
        skillOutdoors = new Image("file:Resources\\Outdoor Icon.png");
        skillFood = new Image("file:Resources\\Food Icon.png");
        skillExplorer = new Image("file:Resources\\Explorer Icon.png");
        skillEntertainment = new Image("file:Resources\\Entertainment Icon.png");
        skillCulture = new Image("file:Resources\\Culture Icon Final.png");
        skillMisc = new Image("file:Resources\\Misc Icon.png");
        ImageView outImageView = new ImageView(skillOutdoors);
        ImageView food = new ImageView(skillFood);
        ImageView explorer = new ImageView(skillExplorer);
        ImageView entertainment = new ImageView(skillEntertainment);
        ImageView culture = new ImageView(skillCulture);
        ImageView misc = new ImageView(skillMisc);

        outImageView.setFitHeight(100);
        outImageView.setFitWidth(100);
        food.setFitHeight(100);
        food.setFitWidth(100);
        explorer.setFitHeight(100);
        explorer.setFitWidth(100);
        entertainment.setFitHeight(100);
        entertainment.setFitWidth(100);
        culture.setFitHeight(100);
        culture.setFitWidth(100);
        misc.setFitHeight(100);
        misc.setFitWidth(100);
        gridPane.add(outImageView, 0, 0, 1, 1);
        gridPane.add(food, 1, 0, 1, 1);
        gridPane.add(explorer, 2, 0, 1, 1);
        gridPane.add(entertainment, 0, 1, 1, 1);
        gridPane.add(culture, 1, 1, 1, 1);
        gridPane.add(misc, 2, 1, 1, 1);
        gridPane.setHgap(30);
        gridPane.setVgap(20);
        gridPane.setAlignment(Pos.CENTER);

        complete = new Image("file:Resources\\CHarity Quest Complete.png");
        comp = new ImageView(complete);
        centerImage();
        BorderPane pane = new BorderPane();
        pane.setPrefSize(400, 300);
        pane.setCenter(comp);
        
       // comp.setFitHeight(100);
       // comp.setFitWidth(100);
        Label username = new Label("             Codey Borrelli");
        username.setAlignment(Pos.CENTER);
        username.setFont(new Font("Arial", 32));
        profileInfo.getChildren().addAll(username, userProfile, separator, skillInfo, skill, gridPane, recent, pane);
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

    public void centerImage() {
        Image img = comp.getImage();
        if (img != null) {
            double w = 0;
            double h = 0;

            double ratioX = comp.getFitWidth() / img.getWidth();
            double ratioY = comp.getFitHeight() / img.getHeight();

            double reducCoeff = 0;
            if(ratioX >= ratioY) {
                reducCoeff = ratioY;
            } else {
                reducCoeff = ratioX;
            }

            w = img.getWidth() * reducCoeff;
            h = img.getHeight() * reducCoeff;

            comp.setX((comp.getFitWidth() - w) / 2);
            comp.setY((comp.getFitHeight() - h) / 2);

        } //if
    } //centerImage

} //Profile
