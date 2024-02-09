import java.util.Stack;

/*
 Question 
You have been given the start and end times of 'N' intervals. Write a function to check
if any two intervals overlap with each other.
Note : If an interval ends at time T and another interval starts at the same time,
 they are not considered overlapping intervals.
 */
public class Question2 {
    public static boolean checkOverlappingIntervals(long[] startTime, long[] endTime) {
        Stack<Long> stack = new Stack<>();
        for (int i = 1; i < startTime.length; i++) {
            if(startTime[i] < startTime[i-1] && endTime[i] < endTime[i-1]){
                continue;
            }
            if(startTime[i] < endTime[i-1] || startTime[i-1] > endTime[i]){
                return true;
            }
            stack.push(endTime[i]);
        }
        return false;
    }

}

