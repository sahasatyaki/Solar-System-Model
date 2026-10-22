/**
 * @author Satyaki Saha
 * @version 1.0
 */

public class Planets extends Planet_speed {

    private String color;
    private double distance;
    private double orbitAngle;
    private int diameter;
    private double Speed;

    /**
     * This constructor is designed to take 5 parameters.
     * @param distance Distance between the planet(s) and the Sun.
     * @param initialAngle Starting angle of orbiting.
     * @param diameter Diameter of the planet(s).
     * @param color Colour of the planet(s).
     * @param Speed Speed of orbiting around the Sun.
     */
    public Planets(double distance, double initialAngle, int diameter, String color, double Speed) {
        this.distance = distance;
        this.orbitAngle = initialAngle;
        this.diameter = diameter;
        this.color = color;
        this.Speed = Speed;

    }

    /**
     * Getter to get the distance of the planet(s) from the Sun.
     * @return The distance of the Planets from the Sun.
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Getter to get the orbital angle of the planet(s) around the Sun.
     * @return The orbital angle of the planets created.
     */
    public double getOrbitAngle() {
        return orbitAngle;
    }

    /**
     * Getter to get the diameter of the planet(s).
     * @return The diameter of the planets created.
     */
    public int getDiameter() {
        return diameter;
    }

    /**
     * Getter to get the colour of planet(s).
     * @return The colour of the planets created.
     */
    public String getColor() {
        return color;
    }

    /**
     * Getter to get the speed of the planet(s).
     * @return The speed of the planets created.
     */
    public double getSpeed() {
        return Speed;
    }

    /**
     * Updates the speed of the planets
     */
    public void updateSpeed(){

        orbitAngle += Speed;
    }
}