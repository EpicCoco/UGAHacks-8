import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * App class that starts the JavaFX application.
 */
public class App extends Application {

    Scene scene;
    BorderPane root;
    HBox buttonMenu;
    TabPane tabs;
    Profile profile;
    Log log;
    Map map;
    UserProfile userProfile;
    Quest primaryQuest;
    Button logButton;
    Button mapButton;
    Button profileButton;

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        setButtonHandlers();
        
        tabs = new TabPane();
        tabs.setTabMinHeight(-10);
        tabs.setTabMaxHeight(-10);
        tabs.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        tabs.getStyleClass().add("wizard");
        //root.getTabs().add(btn);
        
        userProfile = new UserProfile();
        log = new Log(userProfile);
        map = new Map();
        profile = new Profile(userProfile);
                
        primaryQuest = new Quest("Historical Hunt", new Attribute(), new Task("Visit the Snelling dinner bell!", "attributes"), new Task("Eat at OHouse!", "attribute"));
        log.addQuest(primaryQuest);

        //System.out.println(profile.getLog().toString());

        tabs.getTabs().addAll(profile, log, map);
        buttonMenu = new HBox();
        buttonMenu.getChildren().addAll(mapButton, logButton, profileButton);
        buttonMenu.setPadding(new Insets(5, 10, 5, 10));
        buttonMenu.setAlignment(Pos.CENTER);
        root = new BorderPane(tabs, null, null, buttonMenu, null);
        
        scene = new Scene(root, 450, 800);
        primaryStage.setTitle("QuestLine");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        /*
        stage.setTitle("HTML");
        stage.setWidth(500);
        stage.setHeight(500);
        Scene scene = new Scene(new Group());

        VBox root = new VBox();     

        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        InputStream stream = new FileInputStream("lib/test.html");
        //File htmlFile = new File(stream);
        String content = new String(Files.readAllBytes(Paths.get("lib/test.html")));
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(browser);
        webEngine.loadContent(content);

        root.getChildren().addAll(scrollPane);
        scene.setRoot(root);

        stage.setScene(scene);
        stage.show();
        */
    } //start
 
    public void init() {

    } //init

    public static void main(String[] args) {
        launch(args);
    } //main


    /**
     * Sets up buttons and their handlers.
     */
    public void setButtonHandlers() {
        logButton = new Button();
        logButton.setText("");
        logButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tabs.getSelectionModel().select(log);
            }
        });
        Image logImage = new Image("file:Resources\\Property 1=Icons, Property 2=Quests.png");
        ImageView logImageView = new ImageView(logImage);
        logImageView.setFitHeight(40);
        logImageView.setFitWidth(40);
        logButton.setGraphic(logImageView);

        mapButton = new Button();
        mapButton.setText("");
        mapButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tabs.getSelectionModel().select(map);
            }
        });
        Image mapImage = new Image("file:Resources\\Property 1=Icons, Property 2=MapSolid.png");
        ImageView mapImageView = new ImageView(mapImage);
        mapImageView.setFitHeight(40);
        mapImageView.setFitWidth(40);
        mapButton.setGraphic(mapImageView);

        profileButton = new Button();
        profileButton.setText("");
        profileButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tabs.getSelectionModel().select(profile);
            }
        });
        Image profileImage = new Image("file:Resources\\ProfileColor.png");
        ImageView profileImageView = new ImageView(profileImage);
        profileImageView.setFitHeight(40);
        profileImageView.setFitWidth(40);
        profileButton.setGraphic(profileImageView);

    } //setButtonHandlers

    

} //App