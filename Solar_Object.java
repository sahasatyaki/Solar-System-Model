public class Solar_Object {

    protected double dist;
    protected double angulr_velocity;
    protected   double orbitAngle;
    protected int diameter;
    protected String colour;

    /**
     *
     * @param dist Distance between the moon and the planet.
     * @param angulr_velocity Speed of orbiting.
     * @param initialAngle Starting angle of orbiting.
     * @param diameter Diameter of the instance inheriting from this class.
     * @param colour Colour of instance inheriting from this class.
     */
    public Solar_Object(double dist, double angulr_velocity, double initialAngle, int diameter, String colour){

        this.dist = dist;
        this.angulr_velocity = angulr_velocity;
        this.orbitAngle = initialAngle;
        this.diameter = diameter;
        this.colour = colour;

    }

}
