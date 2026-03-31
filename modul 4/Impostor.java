public class Impostor extends Character {
    public Impostor(Character ch) {
        this.name = ch.name;
    }
    
    @Override
    public void kill(Character ch) {
        System.out.println(ch.name + " has been killed!");
    }
    
    @Override
    public void dowork() {
        System.out.println("Impostor " + this.name + " is pretending to work.");
    }
}