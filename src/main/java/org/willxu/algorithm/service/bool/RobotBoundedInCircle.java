package org.willxu.algorithm.service.bool;

public interface RobotBoundedInCircle {
    /**
     * On an infinite plane, a robot initially stands at (0, 0) and
     * faces north. Note that:
     * <p>
     * - The north direction is the positive direction of the y-axis.
     * - The south direction is the negative direction of the y-axis.
     * - The east direction is the positive direction of the x-axis.
     * - The west direction is the negative direction of the x-axis.
     * <p>
     * The robot can receive one of three instructions:
     * <p>
     * - "G": go straight 1 unit.
     * - "L": turn 90 degrees to the left (i.e., anti-clockwise
     *   direction).
     * - "R": turn 90 degrees to the right (i.e., clockwise direction).
     * <p>
     * The robot performs the instructions given in order, and repeats
     * them forever.
     * <p>
     * Return true if and only if there exists a circle in the plane
     * such that the robot never leaves the circle.
     *
     * @param instructions 1 <= instructions.length <= 100
     *                     instructions[i] is 'G', 'L' or, 'R'.
     */
    boolean isRobotBounded(String instructions);
}
