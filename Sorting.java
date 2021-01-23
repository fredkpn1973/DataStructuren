
public class Sorting {

    public static void main(String args[]) {
        char[] chr = { 'h', 'g', 'w', 'j', 'n', 'l', 'p', 'a', 'a', 'a', 'p' };
        char[] chr1 = { 'h', 'g', 'w', 'j', 'n', 'l', 'p', 'a', 'a', 'a', 'p' };
        char[] chr2 = { 'h', 'g', 'w', 'j', 'n', 'l', 'p', 'a', 'a', 'a', 'p', 'f', 'k', 'z', 'y' };
        System.out.println("Ongesorteerd: " + chr);
        System.out.println(insertionSort(chr));
        System.out.println(selectionSort(chr1));
        System.out.println(bubbleSort(chr2));
    }

    public static char[] insertionSort(char[] data) {
        int dataLength = data.length;
        // Zolang we niet aan het einde van de lijst gaan we door
        // We beginnen dus op positie 1 en niet op 0
        for (int k = 1; k < dataLength; k++) {
            // We slaan het huidige karakter op
            char huidig = data[k];
            // We zetten onze tellers gelijk
            int j = k;
            // We beginnen nu met vergelijken. We doen dit todat we aan het
            // beginnen van de array en onze data kleiner is dan de data op de
            // postie voor ons.
            while (j > 0 && data[j - 1] > huidig) {
                // we zetten nu de data op de positie voor ons op onze positie
                data[j] = data[j - 1];
                j--;
            }
            // Als we er zijn dan zetten we onze data op de huidige positie
            data[j] = huidig;
        }
        return data;
    }

    public static char[] selectionSort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;// searching for lowest index
                }
            }
            char smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    public static char[] bubbleSort(char[] arr) {
        int i, j;
        char temp;
        boolean swapped = true;
        while (swapped) {
            for (i = 0; i < arr.length - 1; i++) {                
                for (j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    } else
                        swapped = false;
                }
            }
        }
        return arr;
    }

}
