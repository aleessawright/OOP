/**
 * This class represents a Bender object.
 * 
 * @author Alyssa Wright
 * @version 1.0
 */

public class Bender {
    private String name;
    private int strength;
    private int health;

    /**
     * Creates a constructor that takes in 2 parameters
     * 
     * @param initName     intial name
     * @param initStrength intial strength
     * @param initHealth   initial health
     */
    public Bender(String initName, int initStrength, int initHealth) {
        setName(initName);
        setStrength(initStrength);
        setHealth(initHealth);
    }

    // methods
    public isAlive() {
        if(getHealth() > 0){
            return true; //is alive
        }
    }

    public attack(Bender b) {}

    public equals(){
       /**
        *Two Benders are equal if all the instance variables are equal.
        *Must be a valid override to the equals method defined in Object class. Use this information to
        *determine the parameter type(s) and return type. */ 
    }

    public toString() {
            return String.format("My name is %s. I am a bender. My strength is %d and" +
            "my current health is %d.", getName, getStrength, getHealth);
    }

    // getters
    /**
     * Creates a getter that gets the name
     * 
     * @param newName new name
     */
    public String getName() {
        return name;
    }

    /**
     * Creates a getter that gets the strength
     * 
     * @param newStrength new strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Creates a getter that gets the health
     * 
     * @param newHealth new health
     */
    public int getHealth() {
        return health;
    }

    // setters
    /**
     * Creates a setter that sets the name
     * 
     * @param newName new name
     */
    public String setName() {
        name = newName;
    }

    /**
     * Creates a setter that sets the strength
     * 
     * @param newStrength new strength
     */
    public int setStrength() {
        strength = newStrength;
    }

    /**
     * Creates a setter that sets the health
     * 
     * @param newHealth new health
     */
    public int setHealth() {
        health = newHealth;
    }
}
