import java.util.Arrays;
import java.util.Comparator;

public class Reccomend {
    
    /**
     * Algorithm to prioritize the attributes of a quest and it's tasks. 
     * @param profile
     * @param log
     * @return
     */
    public Quest prioritizeAttributes(Profile profile, Log log) {
       //
        Arrays.sort(profile.getSkills(), new Comparator<Attribute>() {
            @Override
            public int compare(Attribute a, Attribute b) {
                return a.compareTo(b);
            } //compare
        });
 
        for ( int i = 0; i < profile.skills.length; i++) {
            Attribute priority = profile.skills[i]; 
            for ( Quest q : log.quests) {
                if(q.attribute.name.equals(priority.name)){
                    return q; 
                } //if    
            } //for    
        } //for 
        return log.quests.get(1);
    } //Quest



}
