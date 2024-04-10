class point {
    int x;
    int y;

    point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Question4 {
    /*
     * Question
     * You are given an array containing 'N' points in the plane. The task is to
     * find out the distance of the closest points.
     * 
     * Note :
     * Where distance between two points (x1, y1) and (x2, y2) is calculated as [(x1
     * - x2) ^ 2] + [(y1 - y2) ^ 2].
     * Detailed explanation ( Input/output format, Notes, Images )
     * Constraints :
     * 2 <= 'N' <= 10^5
     * -10^5 <= 'x' <= 10^5
     * -10^5 <= 'y' <= 10^5
     * 
     * Time Limit: 1 sec
     * just need to improve time complexity
     */
    public static long closestPair(point coordinates[], int n) {
        long minDist = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i +1; j < n; j++) {
                int x1 = coordinates[i].x;
                int y1 = coordinates[i].y;
                int x2 = coordinates[j].x;
                int y2 = coordinates[j].y;

                long distance = (long) (Math.pow(x1-x2, 2) + Math.pow(y1 -  y2, 2));
                minDist = Math.min(distance, minDist);
            }
        }
        return minDist;
    }
}
