public class AmongUsGame {
    public static void main(String[] args) {
        Character brian, cindy, david, jacky;

        brian = new Crew("Brian");
        cindy = new Crew("Cindy");
        david = new Crew("David");
        jacky = new Crew("Jacky");

        System.out.println("=== All crews doing work ===");
        brian.dowork();
        cindy.dowork();
        david.dowork();
        jacky.dowork();

        System.out.println("\n=== Jacky transforms into NPC ===");
        jacky = new NonPlayableChar("Jacky");
        jacky.dowork();  

        System.out.println("\n=== Impostor attack ===");
        Character impostor = new Impostor(jacky);
        impostor.kill(cindy);

        // Crew menemukan mayat
        System.out.println("\n=== Emergency meeting ===");
        if (david instanceof Crew crew) {
            crew.callMeeting();
        }

        System.out.println("\n=== Investigation ===");
        AmongUsGame.check(brian);
        AmongUsGame.check(david);
        AmongUsGame.check(jacky);      
        AmongUsGame.check(impostor);  
    }

    public static void check(Character ch) {
        if (ch instanceof Impostor) {
            System.out.println(ch.name + " is the IMPOSTOR!");
        } else if (ch instanceof NonPlayableChar) {
            System.out.println(ch.name + " is an NPC (Not Playable Character) - NOT impostor.");
        } else if (ch instanceof Crew) {
            System.out.println(ch.name + " is a crew member - NOT impostor.");
        } else {
            System.out.println(ch.name + " is NOT the impostor.");
        }
    }
}