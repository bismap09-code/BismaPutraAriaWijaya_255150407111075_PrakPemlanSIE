import java.util.ArrayList;
import java.util.List;

public class ValorantGame {
    
    public static void main(String[] args) {
        System.out.println("=== VALORANT: AGENT SELECTION ===\n");
        
        Agent jett = new Duelist("Jett");
        Agent reyna = new Duelist("Reyna");
        Agent brimstone = new Controller("Brimstone");
        Agent viper = new Controller("Viper");
        
        System.out.println("--- AGENT INFO ---");
        jett.displayInfo();
        reyna.displayInfo();
        brimstone.displayInfo();
        viper.displayInfo();
        
        System.out.println("\n--- ABILITY USAGE ---");
        
        jett.useAbility();     
        reyna.useAbility();    
        brimstone.useAbility(); 
        viper.useAbility();     
        
        System.out.println("\n--- ULTIMATE ABILITY ---");
        
        if (jett instanceof Duelist) {
            Duelist duelistJett = (Duelist) jett;
            duelistJett.ultimate();
        }
        
        if (brimstone instanceof Controller) {
            Controller controllerBrim = (Controller) brimstone;
            controllerBrim.ultimate();
        }
        
        System.out.println("\n--- COMBAT SIMULATION ---");
        
        simulateCombat(jett, viper);
        simulateCombat(reyna, brimstone);
        
        System.out.println("\n--- TEAM FIGHT ---");
        
        List<Agent> team = new ArrayList<>();
        team.add(jett);
        team.add(reyna);
        team.add(brimstone);
        team.add(viper);
        
        for (Agent agent : team) {
            agent.useAbility(); 
        }
        
        System.out.println("\n=== END OF GAME ===");
    }
    
    public static void simulateCombat(Agent attacker, Agent defender) {
        System.out.println("\nCOMBAT: " + attacker.name + " vs " + defender.name);
        attacker.useAbility();
        defender.takeDamage(50);
        
        if (attacker instanceof Duelist) {
            System.out.println("   " + attacker.name + " is a Duelist - Very aggressive!");
        } else if (attacker instanceof Controller) {
            System.out.println("   " + attacker.name + " is a Controller - Controlling the area!");
        }
    }
}