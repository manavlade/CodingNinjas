import java.util.HashMap;

public class Question8 {
    public static char kThCharaterOfDecryptedString(String s, Long k) {
        int n = s.length();
        StringBuilder descrypt = new StringBuilder();
        int i = 0;

        while (i < n) {
            char ch = s.charAt(i);
            StringBuilder countStr = new StringBuilder();

            while (i + 1 < n && Character.isDigit(s.charAt(i + 1))) {
                countStr.append(s.charAt(i +1));
                i++;
            }

            int count = Integer.parseInt(countStr.toString());
            for (int j = 0; j < count; j++) {
                descrypt.append(ch);
            }
            i++;
        }
        return descrypt.charAt((int) k - 1);
    }
}
