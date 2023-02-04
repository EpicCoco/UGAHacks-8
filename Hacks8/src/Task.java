import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Task extends HBox {
    boolean completed;
    String desc;
    String attribute;
    CheckBox checkbox;

    

    public Task(boolean b, String d, String a) {
        super();
        completed = b;
        desc = d;
        attribute = a;
        populateSelf();
    } //Task

    public Task(String d, String a) {
        super();
        completed = false;
        desc = d;
        attribute = a;
        populateSelf();
    } //Task

    void populateSelf() {
        checkbox = new CheckBox("!");
        checkbox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(attribute);
            }
        });
        this.getChildren().addAll(checkbox, new Text(desc), new Text(attribute));
    } //populateSelf

    void markCompleted() {
        completed = true;
    } //markCompleted

    void setDesc(String s) {
        desc = s;
    } //setDesc

    String getDesc() {
        return desc;
    } //getDesc

    void setAttr(String s) {
        attribute = s;
    } //setAttr

    String getAttr() {
        return attribute;
    } //getAttr

    boolean isDone() {
        return completed;
    }

    public String toString() {
        return desc + " " + attribute;
    } //toString
} //Task
