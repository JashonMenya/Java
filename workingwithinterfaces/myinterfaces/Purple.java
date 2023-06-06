package workingwithinterfaces.myinterfaces;

import workingwithinterfaces.myinterfaces.interfaces.Color;

/**
 * Represents the color Purple.
 */
public final class Purple implements Color {

    /**
     * Prints some stuff related to Purple.
     */
    public void printStuff() {
        System.out.println("Purple stuff");
    }

    /**
     * Returns the color "Purple".
     *
     * @return The color "Purple".
     */
    public String getColor() {
        return "Purple";
    }

    /**
     * Sets the color to "Purple".
     *
     * @param color The color to set (ignored).
     */
    public void setColor(final String color) {
        System.out.println("Purple");
    }
}
