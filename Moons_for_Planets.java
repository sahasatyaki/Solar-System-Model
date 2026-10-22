/**
 * @author Satyaki Saha
 * @version 1.0
 */

public class Moons_for_Planets extends Solar_Object {

    private Planets corresponding_planet;

    /**
     * This constructor is designed to take 6 parameters.
     * @param corresponding_planet Planet around which the moon shall orbit.
     * @param dist Distance between the moon and the planet.
     * @param angulr_velocity Speed of orbiting.
     * @param initialAngle Starting angle of orbiting.
     * @param diameter Diameter of the moon.
     * @param colour Colour of the moon.
     */
    public Moons_for_Planets(Planets corresponding_planet, double dist, double angulr_velocity, double initialAngle, int diameter, String colour){

        super(dist, angulr_velocity, initialAngle, diameter, colour);
        this.corresponding_planet = corresponding_planet;

    }

    /**
     * Getter to get the diameter of the moon.
     * @return Diameter of the moon.
     */
    public int getDiameter() {
        return diameter;
    }

    /**
     * Getter to get the orbital angle of the moon around the planets.
     * @return Orbital angle of the moon.
     */
    public double getOrbitAngle() {
        return orbitAngle;
    }

    /**
     * Getter to get the distance of the moon from the planet.
     * @return Distance of the moon from the planet.
     */
    public double getDist() {
        return dist;
    }

    /**
     * Getter to get the colour of the moon.
     * @return Colour of the moon.
     */
    public String getColour() {
        return colour;
    }

    /**
     * Updates the position of the moon to create an orbiting effect around the planets.
     */
    public void updateposition(){

        orbitAngle += angulr_velocity;
    }
}
