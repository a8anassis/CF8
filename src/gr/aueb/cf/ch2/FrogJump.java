package gr.aueb.cf.ch2;

/**
 * A small frog wants to go to the other side
 * of the road. The frog is currently at position X
 * and wants to go to a position equal or greater than Y.
 * The small frog jumps a fixed distance, D. Find the minimum
 * number of jumps.
 *
 * For example:
 * X = 10
 * Y = 85
 * D = 30
 *
 * Jumps -> 3
 * 10 + 30 = 40
 * 40 + 30 = 70
 * 70 + 30 = 100
 */
public class FrogJump {

    public static void main(String[] args) {
        int target = 105;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        jumps = (int) Math.ceil((target - start) / (double) hop);

        System.out.println("Jumps: " + jumps);
    }
}
