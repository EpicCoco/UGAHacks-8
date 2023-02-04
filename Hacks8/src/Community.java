import java.util.ArrayList;

public class Community {
    ArrayList<Friend> fren = new ArrayList<Friend>(); //Friends of the current profile
    ArrayList<Reward> frenRew = new ArrayList<Reward>(); //Rewards redeemed by friends of the current profile
    ArrayList<Reward> pastRew = new ArrayList<Reward>(); //Rewards previoulsy redeemed by the current profile
    ArrayList<Reward> displayRew = new ArrayList<Reward>(); //Rewards that are currently available to the profile based off attributes

    public Community(ArrayList<Friend> f,ArrayList<Reward> a, ArrayList<Reward> b, ArrayList<Reward> c) {
        fren = f;
        frenRew = a;
        pastRew = b;
        displayRew = c;
    }

    public Friend getFriend(int i) {
        return fren.get(i);
    }

    public Reward getFrenRew(int i) {
        return frenRew.get(i);
    }

    public Reward getPastRew(int i) {
        return pastRew.get(i);
    }

    public Reward getDisplayRew(int i) {
        return displayRew.get(i);
    }
}
