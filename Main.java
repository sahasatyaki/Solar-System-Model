import java.util.Random;

/**
 * This is the main class of my Solar System Project.
 * @author Satyaki Saha
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {

        SolarSystem creation = new SolarSystem(1700, 1000); // CREATING THE GUI
        Random random = new Random();

        /************************************************* CELESTIAL BODIES **************************************************/
        Fixed_Sun sun = new Fixed_Sun(150);
        Planets Earth = new Planets(200, 0, 14, "BLUE", 1.7);
        Planets Mercury = new Planets(130, 0, 8, "CYAN", 1.9);
        Planets Mars = new Planets(250, 0, 10, "RED", 1.6);
        Planets Jupitet = new Planets(350, 0, 19, "GRAY", 1.5);
        Planets Venus = new Planets(150, 0, 12, "PINK", 1.8);
        Planets Saturn = new Planets(390, 0, 10, "PINK", 1.4);
        Planets Neptune = new Planets(495, 0, 16, "MAGENTA", 1.2);
        Planets Uranus = new Planets(450, 0, 18, "ORANGE", 1.3);

        creation.drawSolarObject(150,0, sun.getDiameter(), sun.getCol()); // BASICALLY, POSITIONING THE SUN AT THE CENTER

        Moons_for_Planets moonforEarth = new Moons_for_Planets(Earth, 20, 4, 90, 10, "WHITE");
        Moons_for_Planets moonforMars = new Moons_for_Planets(Mars, 20, 5, 90, 10, "WHITE" );
        Moons_for_Planets moonforJupiter = new Moons_for_Planets(Jupitet, 22, 3, 90, 12, "WHITE");
        Moons_for_Planets moonforJupiter1 = new Moons_for_Planets(Jupitet, 22, 3, 0, 12, "WHITE");
        Moons_for_Planets moonforJupiter2 = new Moons_for_Planets(Jupitet, 22, 3, 180, 12, "WHITE");
        Moons_for_Planets moonforJupiter3 = new Moons_for_Planets(Jupitet, 22, 3, 270, 12, "WHITE");
        Moons_for_Planets moonforSaturn1 = new Moons_for_Planets(Saturn, 25, 2, 90, 8, "WHITE");
        Moons_for_Planets moonforSaturn2 = new Moons_for_Planets(Saturn, 25, 2, 0, 8, "WHITE");
        Moons_for_Planets moonforSaturn3 = new Moons_for_Planets(Saturn, 25, 2, 180, 8, "WHITE");
        Moons_for_Planets moonforSaturn4 = new Moons_for_Planets(Saturn, 25, 2, 270, 8, "WHITE");
        Moons_for_Planets moonforSaturn5 = new Moons_for_Planets(Saturn, 25, 2, 320, 8, "WHITE");
        Moons_for_Planets moonforUranus = new Moons_for_Planets(Uranus, 20, 3, 90, 10, "WHITE");
        Moons_for_Planets moonforNeptune = new Moons_for_Planets(Neptune, 20, 3, 90, 10, "WHITE");

        /************************************************* ASTEROID BELT **************************************************/
        Asteroid_belt[] asteroid_belt1 = new Asteroid_belt[179];
        for (int i =0; i < 179; i++){
            asteroid_belt1[i] = new Asteroid_belt(sun, 300, -0.2, i*2, random.nextInt(2, 9), "WHITE");
        }
        Asteroid_belt[] asteroid_belt2 = new Asteroid_belt[179];
        for (int j =0; j < 179; j++){
            asteroid_belt2[j] = new Asteroid_belt(sun, 310, 0.2, j*2, random.nextInt(2, 9), "WHITE");
        }
        /************************************************* SATURN'S RINGS **************************************************/
        Moons_for_Planets[] Saturn_rings = new Moons_for_Planets[178];
        for (int j = 0; j < 178; j++){
            Saturn_rings[j] = new Moons_for_Planets(Saturn, 15, 1.5, j*2, random.nextInt(2, 3), "YELLOW");
        }



        while (true){
            /*
            UPDATING THE SPEED AND POSITION OF THE EARTH TO CREATE AN ORBITING EFFECT AROUND THE SUN
            USED THE SIMILAR LOGIC FOR THE MOON TO ORBIT AROUND THE EARTH
             */
            Earth.updateSpeed();
            creation.drawSolarObjectAbout(Earth.getDistance(), Earth.getOrbitAngle(), Earth.getDiameter(), Earth.getColor(), 0, 0); //This changes the position of the earth
            moonforEarth.updateposition();
            creation.drawSolarObjectAbout(moonforEarth.getDist(), moonforEarth.getOrbitAngle(), moonforEarth.getDiameter(), moonforEarth.getColour(), Earth.getDistance(), Earth.getOrbitAngle());

            //DRAWING THE SUN
            creation.drawSolarObject(0, 0, sun.getDiameter(), sun.getCol());

            /*
            UPDATING THE SPEED AND POSITION OF THE MARS TO CREATE AN ORBITING EFFECT AROUND THE SUN.
            USED THE SIMILAR LOGIC FOR THE MOON TO ORBIT AROUND THE MARS.
             */
            Mars.updateSpeed();
            moonforMars.updateposition();
            creation.drawSolarObjectAbout(Mars.getDistance(), Mars.getOrbitAngle(), Mars.getDiameter(), Mars.getColor(), 0, 0);
            creation.drawSolarObjectAbout(moonforMars.getDist(), moonforMars.getOrbitAngle(), moonforMars.getDiameter(), moonforMars.getColour(), Mars.getDistance(), Mars.getOrbitAngle());

            /*
            HERE, I AM JUST CHANGING THE POSITION OF EACH ASTEROID CREATED TO CREATE AN ASTEROID BELT.
             */
            for (int i =0; i < 179; i++) {
                asteroid_belt1[i].updateSpeed();
                creation.drawSolarObjectAbout(asteroid_belt1[i].getDist(), asteroid_belt1[i].getOrbitAngle(), asteroid_belt1[i].getDiameter(), asteroid_belt1[i].getColour(), sun.getDistance(), sun.getOrbitAngle());
            }
            for (int j =0; j < 179; j++) {
                asteroid_belt2[j].updateSpeed();
                creation.drawSolarObjectAbout(asteroid_belt2[j].getDist(), asteroid_belt2[j].getOrbitAngle(), asteroid_belt2[j].getDiameter(), asteroid_belt2[j].getColour(), sun.getDistance(), sun.getOrbitAngle());
            }

            /*
             * UPDATING THE SPEED OF MERCURY TO CREATE AN ORBITING EFFECT AROUND THE SUN.
             * */
            Mercury.updateSpeed();
            creation.drawSolarObjectAbout(Mercury.getDistance(), Mercury.getOrbitAngle(), Mercury.getDiameter(), Mercury.getColor(), 0, 0);

            /*
            UPDATING THE SPEED AND POSITION OF THE JUPITER TO CREATE AN ORBITING EFFECT AROUND THE SUN.
            USED THE SIMILAR LOGIC FOR THE MOON TO ORBIT AROUND THE JUPITER.
             */
            Jupitet.updateSpeed();
            moonforJupiter.updateposition();
            moonforJupiter1.updateposition();
            moonforJupiter2.updateposition();
            moonforJupiter3.updateposition();
            creation.drawSolarObjectAbout(Jupitet.getDistance(), Jupitet.getOrbitAngle(), Jupitet.getDiameter(), Jupitet.getColor(),0, 0);
            creation.drawSolarObjectAbout(moonforJupiter.getDist(), moonforJupiter.getOrbitAngle(), moonforJupiter.getDiameter(), moonforJupiter.getColour(), Jupitet.getDistance(), Jupitet.getOrbitAngle());
            creation.drawSolarObjectAbout(moonforJupiter1.getDist(), moonforJupiter1.getOrbitAngle(), moonforJupiter1.getDiameter(), moonforJupiter1.getColour(), Jupitet.getDistance(), Jupitet.getOrbitAngle());
            creation.drawSolarObjectAbout(moonforJupiter2.getDist(), moonforJupiter2.getOrbitAngle(), moonforJupiter2.getDiameter(), moonforJupiter2.getColour(), Jupitet.getDistance(), Jupitet.getOrbitAngle());
            creation.drawSolarObjectAbout(moonforJupiter3.getDist(), moonforJupiter3.getOrbitAngle(), moonforJupiter3.getDiameter(), moonforJupiter3.getColour(), Jupitet.getDistance(), Jupitet.getOrbitAngle());

            /*
            UPDATING THE SPEED AND POSITION OF THE URANUS TO CREATE AN ORBITING EFFECT AROUND THE SUN.
            USED THE SIMILAR LOGIC FOR THE MOON TO ORBIT AROUND THE URANUS.
             */
            Uranus.updateSpeed();
            moonforUranus.updateposition();
            creation.drawSolarObjectAbout(Uranus.getDistance(), Uranus.getOrbitAngle(), Uranus.getDiameter(), Uranus.getColor(), 0, 0);
            creation.drawSolarObjectAbout(moonforUranus.getDist(), moonforUranus.getOrbitAngle(), moonforUranus.getDiameter(), moonforUranus.getColour(), Uranus.getDistance(), Uranus.getOrbitAngle());

            /*
            UPDATING THE SPEED AND POSITION OF THE SATURN TO CREATE AN ORBITING EFFECT AROUND THE SUN.
            USED THE SIMILAR LOGIC FOR THE MOON TO ORBIT AROUND THE SATURN.
             */
            Saturn.updateSpeed();
            moonforSaturn1.updateposition();
            moonforSaturn2.updateposition();
            moonforSaturn3.updateposition();
            moonforSaturn4.updateposition();
            moonforSaturn5.updateposition();
            creation.drawSolarObjectAbout(Saturn.getDistance(), Saturn.getOrbitAngle(), Saturn.getDiameter(), Saturn.getColor(), 0, 0);
            /*
            CONTINUOUSLY UPDATING THE POSITION OF EACH RING WHICH HAVE THE SIMILAR LOGIC TO MOON, TO CREATE THE SATURN'S RING.
             */
            for (int j=0; j < 178; j++){
                Saturn_rings[j].updateposition();
                creation.drawSolarObjectAbout(Saturn_rings[j].getDist(), Saturn_rings[j].getOrbitAngle(), Saturn_rings[j].getDiameter(), Saturn_rings[j].getColour(), Saturn.getDistance(), Saturn.getOrbitAngle());
            }
            creation.drawSolarObjectAbout(moonforSaturn1.getDist(), moonforSaturn1.getOrbitAngle(), moonforSaturn1.getDiameter(), moonforSaturn1.getColour(), Saturn.getDistance(), Saturn.getOrbitAngle());
            creation.drawSolarObjectAbout(moonforSaturn2.getDist(), moonforSaturn2.getOrbitAngle(), moonforSaturn2.getDiameter(), moonforSaturn2.getColour(), Saturn.getDistance(), Saturn.getOrbitAngle());
            creation.drawSolarObjectAbout(moonforSaturn3.getDist(), moonforSaturn3.getOrbitAngle(), moonforSaturn3.getDiameter(), moonforSaturn3.getColour(), Saturn.getDistance(), Saturn.getOrbitAngle());
            creation.drawSolarObjectAbout(moonforSaturn4.getDist(), moonforSaturn4.getOrbitAngle(), moonforSaturn4.getDiameter(), moonforSaturn4.getColour(), Saturn.getDistance(), Saturn.getOrbitAngle());
            creation.drawSolarObjectAbout(moonforSaturn5.getDist(), moonforSaturn5.getOrbitAngle(), moonforSaturn5.getDiameter(), moonforSaturn5.getColour(), Saturn.getDistance(), Saturn.getOrbitAngle());
            /*
             * UPDATING THE SPEED OF VENUS TO CREATE AN ORBITING EFFECT AROUND THE SUN.
             * */
            Venus.updateSpeed();
            creation.drawSolarObjectAbout(Venus.getDistance(), Venus.getOrbitAngle(), Venus.getDiameter(), Venus.getColor(), 0, 0);

            /*
            UPDATING THE SPEED AND POSITION OF THE VENUS TO CREATE AN ORBITING EFFECT AROUND THE SUN.
            USED THE SIMILAR LOGIC FOR THE MOON TO ORBIT AROUND THE VENUS.
             */
            Neptune.updateSpeed();
            moonforNeptune.updateposition();
            creation.drawSolarObjectAbout(Neptune.getDistance(), Neptune.getOrbitAngle(), Neptune.getDiameter(), Neptune.getColor(), 0, 0);
            creation.drawSolarObjectAbout(moonforNeptune.getDist(), moonforNeptune.getOrbitAngle(), moonforNeptune.getDiameter(), moonforNeptune.getColour(), Neptune.getDistance(), Neptune.getOrbitAngle());

            creation.drawSolarObject(590, 0, 1, "WHITE");


            creation.finishedDrawing(); // AT THE END UPDATING THE GUI TO SHOW THE CHANGE.

        }

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




    }
}