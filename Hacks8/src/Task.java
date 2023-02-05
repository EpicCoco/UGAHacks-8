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

    
    /**
     * Task constructor. Sets truth value, description, and attribute. 
     * @param b
     * @param d
     * @param a
     */
    public Task(boolean b, String d, String a) {
        super();
        completed = b;
        desc = d;
        attribute = a;
        populateSelf();
    } //Task

    /**
     * Task constructor. Sets the description and attribute. 
     * @param d
     * @param a
     */
    public Task(String d, String a) {
        super();
        completed = false;
        desc = d;
        attribute = a;
        populateSelf();
    } //Task

    /**
     * Populates the JavaFX part of the task (i.e. assigns the check box and text).
     */
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

    /**
     * Marks the task as completed.
     */
    void markCompleted() {
        completed = true;
    } //markCompleted

    /**
     * Sets the description of the task.
     * @param s
     */
    void setDesc(String s) {
        desc = s;
    } //setDesc

    /**
     * Gets the descritiopn of the task.
     * @return
     */
    String getDesc() {
        return desc;
    } //getDesc

    /**
     * Sets the attribute for the task.
     * @param s
     */
    void setAttr(String s) {
        attribute = s;
    } //setAttr

    /**
     * Gets the attribute for the task.
     * @return
     */
    String getAttr() {
        return attribute;
    } //getAttr

    /**
     * Returns true if the task is done, false otherwise. 
     * @return
     */
    boolean isDone() {
        return completed;
    } //isDone

    @Override
    public String toString() {
        return desc + " " + attribute;
    } //toString
} //Task
