public class Controller extends Agent {
    
    public Controller(String name) {
        super(name, "Controller");
    }
    
    @Override
    public void useAbility() {
        System.out.println(name + " deploys smoke screen!");
        System.out.println("   Blocks enemy vision for 10 seconds");
    }
    
    public void ultimate() {
        System.out.println(name + " activates ULTIMATE!");
        System.out.println("   Creates a large toxic cloud covering the entire site!");
    }
}