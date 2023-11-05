public class WaterBender extends Bender {
    private boolean healer;

    // constructors
    public WaterBender(String nameNew, int strengthNew, int healthNew, boolean healerNew) {
        name = nameNew;
        strength = strengthNew;
        health = healthNew;
        healer = healerNew
    }

    public WaterBender(String nameNew) {
        name = nameNew;
        strength = 40;
        health = 80;
        healer = false;
    }

    // methods
    public attack(Bender b) {
        if(this.health > 0) {

        }
    }

    public heal(WaterBender wb) {

    }

    public equals() {

    }

    public toString() {

    }

    // getters for all variables
    // no setters
}
