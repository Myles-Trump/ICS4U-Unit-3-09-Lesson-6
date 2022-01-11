
/*
* The "Jet" class
*
* @author Myles Trump
* @version 1.0
* @since 2022-01-01
*/

public class Jet extends Airplane {

    // variables
    /**
    * Multiplier for the speed.
    */
    private static final int MULTIPLIER = 2;

    /**
    * Calling methods from its superclass (Airplane).
    */
    public Jet() {
        super();
    }

    // no getters

    // setters
    /**
    * The setter for speed.
    * @param speed speed gets multiplied
    */
    public void setSpeed(final int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    // methods
    /**
    * The accelerate() method increases the jet's speed.
    */
    public void accelerate() {
        super.setSpeed(getSpeed() * 2);
    }

}
