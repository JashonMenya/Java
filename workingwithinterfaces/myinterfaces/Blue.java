package workingwithinterfaces.myinterfaces;

import workingwithinterfaces.myinterfaces.interfaces.Color;

/**
 * Represents a color Blue.
 */
public class Blue implements Color {

    /**
     * Returns the color "Blue".
     *
     * @return The color "Blue".
     */
    public final String getColor() {
        return "Blue";
    }

    /**
     * Sets the color to "Blue".
     *
     * @param color The color to set (ignored).
     */
    public void setColor(final String color) {
        System.out.println("Blue");
    }

}
