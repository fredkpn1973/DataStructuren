import net.datastructures.*;

public class HeapQueue<K, V> {

    public static void main(String args[]) {

        HeapPriorityQueue<Integer, String> queue = new HeapPriorityQueue<>();

        queue.insert(66, "Pa");
        queue.insert(55, "Jacqueline");
        queue.insert(1, "Mariska");
        queue.insert(44, "Dick");
        queue.insert(33, "Fred");
        queue.insert(22, "Baby");

        Entry min = queue.min();
        System.out.println("De grootte is: " + queue.size() + " De minimale is:" + min.getKey() + "  " + min.getValue());
    }

}
