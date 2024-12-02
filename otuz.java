import java.util.PriorityQueue;

public class otuz {
    public static void main(String[] args) {
        // PriorityQueue ile stringleri uzunluklarına göre sıralama
        PriorityQueue<String> queue = new PriorityQueue<>((s1, s2) -> s1.length() - s2.length());

        // Farklı uzunluklarda stringler ekle
        queue.add("Elma");
        queue.add("Armut");
        queue.add("Karpuz");
        queue.add("Kiraz");

        // Stringleri kısa olandan uzun olana doğru yazdır
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }


}
