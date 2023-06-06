package workingwithinterfaces.myinterfaces;

import workingwithinterfaces.myinterfaces.interfaces.Color;

/**
 * Represents the color Red.
 */
public class Red implements Color {

    /**
     * Returns the color "Red".
     *
     * @return The color "Red".
     */
    public final String getColor() {
        return "Red";
    }

    /**
     * Sets the color to "Red".
     *
     * @param color The color to set (ignored).
     */
    public final void setColor(final String color) {
        System.out.println("Red");
    }
}
