package workingwithinterfaces.myinterfaces;

import workingwithinterfaces.myinterfaces.interfaces.Printable;

/**
 * Shirt class.
 */
public class Shirt implements Printable {

    /**
     * Print the shirt description.
     */
    public void print() {
        System.out.println("Shirt description");
    }

}
