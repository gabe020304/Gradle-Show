package org.gradleproj;

public class TurtleStage {

    public static void main() {
        System.out.println("\nNow lets introduce our turtle attacks!\n");
        turtleAttack();
        System.out.println("\nThat is it everyone! Thank you for coming, and come back soon!");
    }

    public static void turtleAttack() {
        Turtle turtle = new Turtle();
        turtle.sword();
    }
}
