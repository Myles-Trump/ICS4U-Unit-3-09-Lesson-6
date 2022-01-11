/*
* The "FlyTest" program is a program that uses Jet.java to control a jet
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-XX
*/

/**
* This is a program that blanks.
*/
final class FlyTest {

    /**
    * 4.
    */
    public static final int C4 = 4;
    /**
    * 212.
    */
    public static final int C212 = 212;
    /**
    * 422.
    */
    public static final int C422 = 422;
    /**
    * 5000.
    */
    public static final int C5000 = 5000;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private FlyTest() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        Airplane biplane = new Airplane();
        biplane.setSpeed(C212);
        System.out.println(biplane.getSpeed());
        Jet boeing = new Jet();
        boeing.setSpeed(C422);
        System.out.println(boeing.getSpeed());
        int x = 0;
        while (x < C4) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > C5000) {
                biplane.setSpeed(biplane.getSpeed() * 2);
            } else {
                boeing.accelerate();
            }
            x++;
        }
        System.out.println(biplane.getSpeed());
        System.out.println("\nDone.");
    }
}
