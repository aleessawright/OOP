/**
 *This class represents a Fly object.
 *@author Alyssa Wright
 *@version 1.0
 */
public class Fly {
    private double mass;
    //the mass of the fly in grams; the type of this
    // variable must allow decimal values for mass
    private double speed;
    //how quickly the fly can maneuver through the air,
    // represented as a double

    //constructor
    /**
     *Creates a constructor that takes in 2 parameters
     * @param initMass intial mass
     * @param initSpeed intial speed
     */
    public Fly(double initMass, double initSpeed) {
        mass = initMass;
        speed = initSpeed;
    }
    /**
     *Creates a constructor that takes in 1 parameter
     * @param initMass intial mass
     */
    public Fly(double initMass) {
        mass = initMass;
        speed = 10;
    }
    /**
     *Creates a constructor that takes in 0 parameters
     */
    public Fly() {
        mass = 5;
        speed = 10;
    }

    //method grow
    /**
     *Creates a method that changes the mass and speed of a fly
     * @param addMass added mass
     */
    public void grow(int addMass) {
        this.setMass(addMass + this.getMass());
        if (this.getMass() < 20) {
            this.setSpeed(addMass + this.getSpeed());
            if (this.getMass() > 20) {
                this.setMass(20);
            }
        } else if (this.getMass() >= 20) {
            if (addMass > 20) {
                this.setSpeed(-.5 * (addMass - 20));
            }
        }
    }
    /**
     *Creates a method that returns the status
     *  of the fly, if it is dead or not
     * @return boolean isDead status
     */
    public boolean isDead() {
        if (this.getMass() == 0) {
            return true;
        }
        return false;
    }
    /**
     *Creates a method that prints the statistics of the frog
     * @return string of fly statistics
     */
    public String toString() {
        if (this.getMass() == 0) {
            return String.format("I'm dead, but I used to be a fly "
                    + "with a speed of %.2f.", this.getSpeed());
        } else {
            return String.format("I'm a speedy fly with %.2f "
                    + "speed and %.2f mass." , this.getSpeed(), this.getMass());
        }
    }
    /**
     *Creates a getter that gets the fly's mass
     * @return mass
     */
    public double getMass() {
        return mass;
    }
    /**
     *Creates a getter that gets the fly's speed
     * @return speed
     */
    public double getSpeed() {
        return speed;
    }
    /**
     *Creates a setter that sets the fly's mass
     * @param newMass new mass
     */
    public void setMass(double newMass) {
        mass = newMass;
    }
    /**
     *Creates a setter that sets the fly's speed
     * @param newSpeed new speed
     */
    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }
}