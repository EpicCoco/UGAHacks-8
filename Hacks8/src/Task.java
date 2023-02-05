import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
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
        Text textDesc = new Text(desc);
        checkbox = new CheckBox();
        checkbox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                completed = !completed;
                if (completed) {
                    textDesc.setFill(Color.GRAY); 
                } else {
                    textDesc.setFill(Color.BLACK); 
                } //if
            } //handle
        });
        this.getChildren().addAll(checkbox, textDesc);
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
