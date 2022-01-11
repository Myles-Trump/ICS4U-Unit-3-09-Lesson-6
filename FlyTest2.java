/*
* The "FlyTest2" program is a program that uses Airplane.java to control an
* airplane
*
* @author  Myles Trump
* @version 1.0
* @since   2022-01-10
*/

/**
* This is a program that blanks.
*/
final class FlyTest2 {

    /**
    * 212.
    */
    public static final int C212 = 212;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private FlyTest2() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        Airplane biplane = new Airplane();
        biplane.speed = C212;
        System.out.println(biplane.speed);
        System.out.println("\nDone.");
    }
}
