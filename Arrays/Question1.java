public class Question1{
   /*
    * Question
    * You are given an integer array 'ARR' of size 'N' and an integer 'S'. Your
    * task is to return the list of all pairs of elements such that each sum of
    * elements of each pair equals 'S'.
    * Note:
    * Each pair should be sorted i.e the first value should be less than or equals
    * to the second value.
    * Return the list of pairs sorted in non-decreasing order of their first value.
    * In case if two pairs have the same first value, the pair with a smaller
    * second value should come first.
    */
    public static boolean checkOverlappingIntervals(long[] startTime, long[] endTime) 
    {
        if(startTime.length == 0 && endTime.length == 0){
            return true;
        }
        for (int i = 0; i < startTime.length-1; i++) {
            for (int j = i+1; j < endTime.length; j++) {
                if(endTime[i] > startTime[j]){
                    return true;
                }
            }
        }
        return false;
    }

}