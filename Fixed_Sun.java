/**
 * @author Satyaki Saha
 * @version 1.0
 */

public class Fixed_Sun {

    private String col;
    private int diameter;
    private double distance;
    private double orbitAngle;

    /**
     *This constructor is designed to take 1 parameter.
     * @param diameter Diameter of the Sun.
     */
    public Fixed_Sun(int diameter){

        this.diameter = diameter;
        this.col = "YELLOW";
    }

    /**
     * Getter to get the diameter of the Sun.
     * @return The diameter of the asteroids created.
     */
    public int getDiameter() {
        return diameter;
    }

    /**
     * Getter to get the colour of the Sun.
     * @return The colour of the asteroids created.
     */
    public String getCol() {
        return col;
    }

    /**
     * Getter to get the orbital angle of the Sun set to 0.
     * @return The orbital angle of the asteroids created.
     */
    public double getOrbitAngle() {
        return orbitAngle;
    }

    /**
     * Getter to get the distance of the Sun to position it at the center of the GUI.
     * @return The distance of the asteroids from the celestial body.  In this case the sun.
     */
    public double getDistance() {
        return distance;
    }
}
