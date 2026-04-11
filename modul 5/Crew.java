public class Crew implements ICrew {
    private String name;
    private boolean alive; 
    
    public Crew(String name) {
        this.name = name;
        this.alive = true;
    }
    
    public void setDead() {
        this.alive = false;
    }
    
    public boolean isAlive() {
        return alive;
    }
    
    @Override
    public void doWork() {
        if (alive) {
            System.out.println("Crew " + this.name + " is doing work.");
        } else {
            System.out.println("Crew " + this.name + " is dead and cannot work.");
        }
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    public void callMeeting() {
        if (alive) {
            System.out.print(this.name + " found a corpse ");
            System.out.print("and calls a meeting. ");
            System.out.println("Let's find the impostor!");
        } else {
            System.out.println(this.name + " is dead and cannot call a meeting.");
        }
    }


    @Override
    public void kick() {
        System.out.println("Crew " + this.name + " has been kicked out of the spaceship!");
    }
}