public class Character {
    public String name;
    
    public void dowork() {
        System.out.println("Character is doing something.");
    }
    
    public void kill(Character ch) {
        System.out.println(ch.name + " has been killed!");
    }
}