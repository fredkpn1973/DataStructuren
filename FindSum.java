import java.security.KeyStore.TrustedCertificateEntry;
import java.util.*;

public class FindSum {

    public static void main(String args[]) {

        List<Integer> lijst = new ArrayList<>();
        lijst.add(20);
        lijst.add(3);
        lijst.add(3);
        lijst.add(3);
        lijst.add(3);
        lijst.add(5);
        lijst.add(4);
        lijst.add(33);

        /**
         * boolean gevonden = false; int getal = lijst.get(7);
         * System.out.println(getal); while (!gevonden) { for (int outer = 0; outer < 7;
         * outer++) { for (int inner = 1; inner < 7; inner++) { if ((lijst.get(outer) +
         * lijst.get(inner)) == 8) { System.out.println(outer + "," + inner); gevonden =
         * true; } } }
         * 
         * }
         */
        // System.out.println(findSum(lijst, 0));
        System.out.println(sumFind(lijst, 2, 0, 1));

    }

    /**
     * public static boolean findSum(List<Integer> lijst, int positie) { boolean
     * gevonden = false;
     * 
     * for (int outer = 0; outer < positie; outer++) { for (int inner = outer + 1;
     * inner < positie; inner++) { if ((lijst.get(outer) + lijst.get(inner)) ==
     * lijst.get(positie)) { System.out.println("Op positie: " + outer + " Staat: "
     * + lijst.get(outer) + " Op positie: " + inner + " Staat: " +
     * lijst.get(inner)); gevonden = true; } else { gevonden = false; } } } if
     * (positie < lijst.size() || !gevonden) { positie++; findSum(lijst, positie); }
     * return gevonden;
     * 
     * }
     */

    public static boolean sumFind(List<Integer> lijst, int sumPos, int start, int loopCounter) {

        if (lijst.get(sumPos) == (lijst.get(start) + lijst.get(loopCounter))) {
            return true;
        }
        if (loopCounter + 1 < sumPos) {
            loopCounter++;
            return sumFind(lijst, sumPos, start, loopCounter);
        } else if (start + 1 < sumPos) {
            start++;
            loopCounter = start + 1;
            return sumFind(lijst, sumPos, start, loopCounter);
        } else {
            if (sumPos + 1 < lijst.size()) {
                sumPos++;
                return sumFind(lijst, sumPos, 0, 1);
            }
        }
        return false;
    }
}