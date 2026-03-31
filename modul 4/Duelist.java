public class Duelist extends Agent {
    
    public Duelist(String name) {
        super(name, "Duelist");
    }
    
    @Override
    public void useAbility() {
        System.out.println(name + " dashes forward aggressively!");
        System.out.println("   Deals 50 damage to enemies in front");
    }
    
    public void ultimate() {
        System.out.println(name + " activates ULTIMATE!");
        System.out.println("   Gains 5 kills and resets all abilities!");
    }
}