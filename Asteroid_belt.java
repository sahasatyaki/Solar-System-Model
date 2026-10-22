/**
 * @author Satyaki Saha
 * @version 1.0
 */


public class Asteroid_belt extends Planet_speed {

    private Fixed_Sun central;
    private double dist;
    private double angulr_velocity;
    private  double orbitAngle;
    private int diameter;
    private String colour;

    /**
     * This constructor is designed to take 6 parameters.
     * @param central Basically, the corresponding celestial body around which it should orbit.
     * @param dist Distance between the celestial body and the asteroids.
     * @param angulr_velocity Speed of orbiting around the celestial body.
     * @param initialAngle Starting angle of orbiting.
     * @param diameter Diameter of the asteroids.
     * @param colour Colour of the asteroids.
     */
    public Asteroid_belt(Fixed_Sun central, double dist, double angulr_velocity, double initialAngle, int diameter, String colour){

        this.central = central;
        this.dist = dist;
        this.angulr_velocity = angulr_velocity;
        this.orbitAngle = initialAngle;
        this.diameter = diameter;
        this.colour = colour;

    }

    /**
     * Getter to get the diameter of the asteroids.
     * @return The diameter of the asteroids created.
     */
    public int getDiameter() {
        return diameter;
    }

    /**
     * Getter to get the orbital angle of the asteroids around the Sun.
     * @return The orbital angle of the asteroids created.
     */
    public double getOrbitAngle() {
        return orbitAngle;
    }

    /**
     * Getter to get the distance of the asteroids from the Sun.
     * @return The distance of the asteroids from the Sun.
     */
    public double getDist() {
        return dist;
    }

    /**
     * Getter to get the colour of asteroids.
     * @return The colour of the asteroids created.
     */
    public String getColour() {
        return colour;
    }

    /**
     * Updates the position of the asteroids to create a visual effect.
     */
    public void updateSpeed(){

        orbitAngle += angulr_velocity;
    }
}