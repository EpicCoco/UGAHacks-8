public class Reward {
    int xp;
    String name;
    int rewAmount;


    public int getXP() {
        return xp;
    } //getXP

    public void setXP(int i) {
        xp = i;
    } //setXP

    public String getName() {
        return name;
    } //getName

    public void setName(String s)  {
        name = s;
    } //setName

    public int getAmount() {
        return rewAmount;
    } //getAmount

    public void setAmount(int i) {
        rewAmount = i;
    } //setAmount

    public String toString() {
        return (name + " " + xp);
    } //toString
} //Reward
