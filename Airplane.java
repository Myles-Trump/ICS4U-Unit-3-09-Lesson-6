/*
* The "Airplane" class
*
* @author Myles Trump
* @version 1.0
* @since 2022-01-01
*/

public class Airplane {

    // the Airplane class has one field
    /**
    * Defining and setting speed.
    */
    private int speed = 0;

    // getters
    /**
    * Getter for speed.
    * @return speed
    */
    public int getSpeed() {
        return this.speed;
    }

    // setters
    /**
    * Setter for speed.
    * @param newSpeed new current speed
    */
    public void setSpeed(final int newSpeed) {
        this.speed = newSpeed;
    }
}
