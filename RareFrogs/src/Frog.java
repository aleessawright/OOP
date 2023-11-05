/**
 *This class represents a Frog object.
 *@author Alyssa Wright
 *@version 1.0
 */
public class Frog {

    //the name of this Frog, which can be made of any
    // combination of characters
    private String name;
    //the age of the Frog in months, represented as an int
    private int age;
    //how quickly this Frog’s tongue can shoot
    // out of its mouth, represented as a
    //double
    private double tongueSpeed;
    //a value that represents whether this Frog
    // is a froglet (the stage between tadpole
    //and adult frog), which only has two possible
    // values: true or false
    private boolean isFroglet;
    //the name of the species of this Frog
    private static String species = "Rare Pepe";

    //constructors
    /**
     *Creates a constructor that has 3 parameters for frog stats
     * @param initName initial name
     * @param initAge initial age in months
     * @param initTongueSpeed initial tongue speed
     */
    public Frog(String initName, int initAge, double initTongueSpeed) {
        name = initName;
        age = initAge;
        tongueSpeed = initTongueSpeed;
        if (this.getAge() >= 1 && this.getAge() <= 7) {
            this.setIsFroglet(true);
        } else {
            this.setIsFroglet(false);
        }
    }
    /**
     *Creates a constructor that has 3 parameters for frog stats
     * @param initName initial name
     * @param initAgeYears initial age in years
     * @param initTongueSpeed initial tongue speed
     */
    public Frog(String initName, double initAgeYears, double initTongueSpeed) {
        name = initName;
        age = (int) (initAgeYears * 12);
        tongueSpeed = initTongueSpeed;
        if (this.getAge() >= 1 && this.getAge() <= 7) {
            this.setIsFroglet(true);
        } else {
            this.setIsFroglet(false);
        }
    }
    /**
     *Creates a constructor that has 1 parameter
     * @param initName initial name
     */
    public Frog(String initName) {
        name = initName;
        age = 5;
        tongueSpeed = 5;
        if (this.getAge() >= 1 && this.getAge() <= 7) {
            this.setIsFroglet(true);
        } else {
            this.setIsFroglet(false);
        }
    }


    //methods
    /**
     *Creates a method that increases frog age and changes tongue speed
     * @param addMonths months added
     */
    public void grow(int addMonths) {
        this.setAge(addMonths + this.getAge());

        if (this.getAge() - addMonths < 12) {
            this.setTongueSpeed(addMonths + this.getTongueSpeed());
            if (this.getTongueSpeed() > 12) {
                this.setTongueSpeed(12);
            }
        }

        if (this.getAge() > 30) {
            this.setTongueSpeed(this.getTongueSpeed()
                    - (this.getAge() - 30));
        }

        if (this.getTongueSpeed() < 5) {
            this.setTongueSpeed(5);
        }
        if (this.getAge() >= 1 && this.getAge() <= 7) {
            this.setIsFroglet(true);
        } else {
            this.setIsFroglet(false);
        }
    }
    /**
     *Creates a method that increases frog
     * age and changes tongue speed
     */
    public void grow() {
        this.setAge(this.getAge() + 1);
        if (this.getAge() < 12) {
            this.setTongueSpeed(1 + this.getTongueSpeed());
        } else if (this.getAge() > 30) {
            this.setTongueSpeed(this.getTongueSpeed() - (double) ((this.getAge() + 1) - 30));
        }
        if (this.getTongueSpeed() < 5) {
            this.setTongueSpeed(5);
        }
        if (this.getAge() >= 1 && this.getAge() <= 7) {
            this.setIsFroglet(true);
        } else {
            this.setIsFroglet(false);
        }
    }
    /**
     *Creates a method that increases frog age
     * and changes tongue speed based on fly/food's mass
     * @param food fly is the food
     */
    public void eat(Fly food) {
        if (!food.isDead()) {
            if (this.getTongueSpeed() > food.getSpeed()) {
                //fly is caught
                if (food.getMass() >= .5 * this.getAge()) {
                    this.grow(1);
                    //Additionally, if the Fly’s
                    // original mass is at least 0.5 times the age of the Frog,
                    //the Frog ages by one month using its grow() method.
                }
                food.setMass(0);
            } else {
                food.grow(1);
            }
        }
    }
    /**
     *Creates a method that prints the statistics of the frog
     * @return a string of frog stats
     */
    public String toString() {
        if (this.getIsFroglet()) {
            return String.format("My name is %s and I'm a rare froglet! "
                            + "I'm %d months old and my tongue has a speed of %.2f.",
                    getName(), getAge(), getTongueSpeed());
        } else {
            return String.format("My name is %s and I’m a rare frog."
                            + "I’m %d months old and my tongue has a speed of %.2f.",
                    getName(), getAge(), getTongueSpeed());
        }
    }

    //getters
    /**
     *Creates a getter that gets the frog's name
     * @return returns frog's name
     */
    public String getName() {
        return name;
    }
    /**
     *Creates a getter that gets the frog's age
     * @return return frog's age
     */
    public int getAge() {
        return age;
    }
    /**
     *Creates a getter that gets the frog's tongue speed
     *@return returns current speed
     */
    public double getTongueSpeed() {
        return tongueSpeed;
    }
    /**
     *Creates a getter that gets the frog's froglet's status
     * @return returns if a froglet or not
     */
    public boolean getIsFroglet() {
        return isFroglet;
    }
    /**
     *Creates a getter that gets the frog's species
     * @return returns type of frog species
     */
    public String getSpecies() {
        return species;
    }

    //setters
    /**
     *Creates a setter that sets the frog's age
     * @param newAge new age
     */
    public void setAge(int newAge) {
        age = newAge;
    }
    /**
     *Creates a setter that sets the frog's tongue speed
     * @param newTongueSpeed new tongue speed
     */
    public void setTongueSpeed(double newTongueSpeed) {
        tongueSpeed = newTongueSpeed;
    }
    /**
     *Creates a setter that sets the frog's froglet's status
     * @param newFroglet new Froglet boolean
     */
    public void setIsFroglet(boolean newFroglet) {
        isFroglet = newFroglet;
    }
    /**
     *Creates a setter that sets the frog's Species
     * @param newSpecies new species
     */
    public void setSpecies(String newSpecies) {
        species = newSpecies;
    }

}
