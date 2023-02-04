import javafx.scene.layout.HBox;

public class Friend extends HBox {
    String name;
    int lvl;
    int xp;

    public Friend(String s, int i, int j) {
        name = s;
        lvl = i;
        xp = j;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int i) {
        lvl = i;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int i) {
        xp = i;
    }

}
