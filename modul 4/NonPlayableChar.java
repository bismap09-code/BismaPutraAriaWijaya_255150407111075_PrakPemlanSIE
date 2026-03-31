public class NonPlayableChar extends Character {
    public NonPlayableChar(String name) {
        this.name = name;
    }
    
    @Override
    public void dowork() {
        System.out.println("NPC " + this.name + " is wandering around.");
    }
    
    public void disguise() {
        System.out.println(this.name + " is disguising as a crew member.");
    }
}