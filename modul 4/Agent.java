public class Agent {
    protected String name;
    protected String role;
    protected int health;
    
    public Agent(String name, String role) {
        this.name = name;
        this.role = role;
        this.health = 150;
    }
    
    public void displayInfo() {
        System.out.println("Agent: " + name + " (" + role + ")");
        System.out.println("Health: " + health);
    }
    
    public void useAbility() {
        System.out.println(name + " uses basic ability!");
    }
    
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage! Health: " + health);
        if (health <= 0) {
            System.out.println(name + " has been eliminated!");
        }
    }
}