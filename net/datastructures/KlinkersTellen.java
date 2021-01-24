import java.lang.Math;

public class KlinkersTellen {

    // static int klinkerCount = 0;

    public static void main(String[] args) {

        String s = "aeoui";
        System.out.println(klinkers(s));

    }

    public static boolean klinkers(String s) {
        int klinkerCount = 0;
        if (s.length() == 0)
            return false;
        if (isKlinker(s.charAt(0)))
            klinkerCount = Math.max(klinkerCount, ++klinkerCount);

        klinkers(s.substring(1));
        return klinkerCount > (s.length() / 2);

    }

    public static boolean isKlinker(char c) {
        char[] klinker = { 'a', 'e', 'i', 'o', 'u' };
        int teller = 0;
        while (teller < klinker.length) {
            if (c == klinker[teller]) {
                return true;
            }
            teller++;
        }
        return false;
    }
}
