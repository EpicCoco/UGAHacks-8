
public class Attribute {
    
        public String name; 
        private int weight; 
        
        //default contructor
        public Attribute() {
            this.weight = 0; 
            name = "Other"; 
        } //Attribute

        //constructor
        public Attribute(int weight, String name) {
        this.weight = weight; 
        this.name = name; 
        } //Attribute
        
        public int getWeight() {
            return this.weight;
        } //getWeight

        public void setWeight(int weight) {
            this.weight = weight;
        } //setWeight
        
        
        public String getName(Attribute attribute) {
            if (name.equalsIgnoreCase("Recreation")) {
                return "Recreation"; 
            } else if (name.equalsIgnoreCase("Arts")) {
                return "Culture";
            } else if (name.equalsIgnoreCase("Entertainment")) {
                return "Entertainment";
            } else if (name.equalsIgnoreCase("Food")) {
                return "Food";
            } else if (name.equalsIgnoreCase("Explore")) {
                return "Explore";
            } else {
                return "Misc";
            }
            
        }

        public int compareTo(Attribute attribute) {
            return this.getWeight() - attribute.getWeight();
        } //compareTo
    
    }
