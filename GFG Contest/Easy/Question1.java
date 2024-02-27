public class Question1 {
    public static boolean isMagicArray(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static String smallestString(int n, String s) {
        if(s.length() <= 1) return "-1";
        char [] ch = s.toCharArray();
        for (int i = 0; i < n/2; i++) {
            if(ch[i] != 'a'){
                ch[i] = 'a';
                return new String(ch);
            }
        } 
        ch[n-1] = 'b';
        return new String(ch);
    }
}
