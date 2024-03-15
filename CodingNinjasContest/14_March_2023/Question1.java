import java.util.ArrayList;

public class Question1 {
    /*
     * Question
     * Given an array ‘A’. Your task is to choose any two different elements of the
     * array say ‘X’ and ‘Y’, such that ‘Z’ is minimum possible. Where ‘Z’ = ‘X’ ×
     * ’Y’. Return the minimum possible value of ‘Z’.
    * Example:
     * ‘N’ = [5, 3, 9, 6, 3]
     * ‘X’ can be chosen as 3(index 1) and ‘Y’ can be chosen as 3(index 4). 'Z' =
     * 3*3 = 9.
     * No other combination can have a smaller value of ‘Z’
     */
    static int minimiseZ(ArrayList<Integer> a) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) >= 0){
                positive.add(a.get(i));
            }
            else {
                negative.add(a.get(i));
            }
        }
        int posC = positive.size();
        int negC = negative.size();

        if(negC == 0){
            return positive.get(0) * positive.get(1);
        }
        else if(posC == 0){
            return negative.get(negC - 2) * negative.get(negC - 1);
        }
        else {
            return negative.get(0) * positive.get(posC - 1);
        }
    }
}
