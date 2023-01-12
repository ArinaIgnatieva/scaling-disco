import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        int previousY = 0;
        int previousX = 0;
        int platY = 0;
        int x1 = 0;
        int x2 = 0;
        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        for (int i = 0; i < surfaceN; i++) {
            int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
            x1 = (landY == previousY ? previousX : x1);
            x2 = (landY == previousY ? landX : x2);
            platY = (landY == previousY ? landY : platY);
            previousX = landX;
            previousY = landY;
        }

        // game loop
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int power = in.nextInt(); // the thrust power (0 to 4).
            
            if((x1-X) > 0) {
                if (hSpeed < 30) {
                    rotate = -30;
                    power = 4;
                }else if (hSpeed > 80) {
                    rotate = 25;
                    power = 4;
                }else if (hSpeed > 30 && hSpeed < 80) {
                    power = 3;
                }
            }
            if((X-x2) > 0) {
                if (hSpeed > -30) {
                    rotate = 25;
                    power = 4;
                }else if (hSpeed < -40) {
                    rotate = -45;
                    power = 4;
                }else {
                    rotate = 10;
                    power = 4;
                }
            }
            if ((x1 - 500) < X && X < (x2 + 500)) {
                if (Y < (platY + 400)) {
                    rotate = 0;
                    power = 4;
                }
                if (hSpeed > 15) {
                    rotate = 30;
                    power = 4;
                }else if (hSpeed < -15) {
                    rotate = -30;
                    power = 4;
                }else if (hSpeed == 0) {
                    rotate = 0;
                    power = 4;
                }
                if (vSpeed > -20 && power > 0) {
                    power--;
                }
            
                
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // rotate power. rotate is the desired rotation angle. power is the desired thrust power.
        System.out.println(rotate + " " + power);        }
    }
} 
