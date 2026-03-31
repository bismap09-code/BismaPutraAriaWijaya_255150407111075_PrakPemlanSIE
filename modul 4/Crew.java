public class Crew extends Character {
    public Crew(String name) {
        this.name = name;
    }
    
    @Override
    public void dowork() {
        System.out.println("Crew " + this.name + " is doing work.");
    }
    
    public void callMeeting() {
        System.out.print(this.name + " found a corpse ");
        System.out.print("and calls a meeting. ");
        System.out.println("Let's find the impostor!");
    }
}