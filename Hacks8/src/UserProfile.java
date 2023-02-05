import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class UserProfile extends HBox {
    
    public int xp;

    Image userImage;
    VBox profileInfo;
    Insets insets25 = new Insets(10, 20, 10, 20);
    ProgressBar xpBar;

    /**
     * UserProfile constructor for a user profile, including profile picture and xp bar. 
     */
    public UserProfile() {
        xp = 0;
        this.setPadding(insets25);
        this.setAlignment(Pos.CENTER);
        xpBar = new ProgressBar(0);
        userImage = new Image("file:Resources\\Codey profile.png");
        ImageView userImageView = new ImageView(userImage);
        userImageView.setFitHeight(125);
        userImageView.setFitWidth(125);
        this.getChildren().addAll(userImageView, xpBar);
    } //UserProfile

    /**
     * Setter method for xp progress.
     * @param progress
     */
    public void xpProgress(int progress) {
        xpBar.setProgress(((double)progress)/100);
    } //xpProgress

} //UserProfile
