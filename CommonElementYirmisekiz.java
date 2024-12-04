
import java.util.HashSet;

public class CommonElementYirmisekiz {

    public static int[] findCommonElements(int[] list1, int[] list2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> commonSet = new HashSet<>();

        // İlk diziyi HashSet'e ekle
        for (int num : list1) {
            set1.add(num);
        }

        // İkinci dizideki elemanları kontrol et
        for (int num : list2) {
            if (set1.contains(num)) {
                commonSet.add(num); // Ortak elemanları HashSet'e ekle
            }
        }

        // HashSet'i int[] dizisine dönüştür
        int[] result = new int[commonSet.size()];
        int index = 0;
        for (int num : commonSet) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arrayList1 = { 2, 5, 7, 8, 9 };
        int[] arrayList2 = { 2, 5, 77, 0, 9, 11, 22, 33 };

        int[] ortaklar = findCommonElements(arrayList1, arrayList2);
        for (int i : ortaklar) {
            System.out.print(i + ",");
        }
    }
    
}
