public class Task {
    boolean completed;
    String desc;
    String attribute;

    public Task(boolean b, String d, String a) {
        completed = b;
        desc = d;
        attribute = a;
    }

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
        if(completed == true){
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "no attributes";
    } //toString
} //Task
