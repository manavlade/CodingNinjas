package Reccurssion;

public class Question1 {
    /*
     * Question
     * Given a source point (sx, sy) and a destination point (dx, dy), the task is
     * to check if it is possible to reach the destination point using the following
     * valid moves:
     * (a, b) -> (a + b, b)
     * (a, b) -> (a, a + b)
     * Your task is to find if it is possible to reach the destination point using
     * only the desired moves or not.
     * For example:
     * For the coordinates, source point = (1, 1) and destination point = (3, 5)
     * The output will be true as the destination point can be reached using the
     * following sequence of moves:
     * (1, 1) -> (1, 2) -> (3, 2) -> (3, 5)
     */
   // Only 36 of 40 test cases solved due to time limit exceeded
    public static boolean reachDestination(int sx, int sy, int dx, int dy) {
        if (sx == dx && sy == dy) {
            return true;
        }

        if (sx > dx || sy > dy) {
            return false;
        }

        return reachDestination(sx + sy, sy, dx, dy) || reachDestination(sx, sy + sx, dx, dy);
    }

    // Alternative solution 
    // public static boolean reachDestination(int sx, int sy, int dx, int dy) {

    //     return sx == dx && sy == dy || (dx < dy && reachDestination(sx, sy, dx, dy - dx))
    //             || (dy < dx && reachDestination(sx, sy, dx - dy, dy));

    // }
}
