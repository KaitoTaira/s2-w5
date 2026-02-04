public class Plant{
    public static final boolean usesChloraphyll = true;
    public static int numPlants = 0;
    public final String species;
    private int age;
    private String name;
    private double height;

    public Plant (String name, String species){
          age = 0;
          this.name = name;
          height = 0;
          this.species = species;
          numPlants ++;
    }

    public String type(){
         return "I am a plant and my name is: " + this.name;
    }

    public static int getNumPlants(){
        return numPlants;
    }

    public void increaseAge(int years){
         age +=years;
    }

    public String name(){
        return name;
    }
    public int age(){
        return age;
    }

    public static void main(String[] args) {
        boolean v = Plant.usesChloraphyll;
        Plant p = new Plant("osmanthus", "plantae");
        System.out.println(getNumPlants());
        Plant p1 = new Plant("morning glory", "plantae");
        Plant p2 = new Plant("aubergine", "plantae");
        Plant p3 = new Plant("hydragneas", "plantae");
        System.out.println(getNumPlants());
    }
}
