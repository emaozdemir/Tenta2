public class ArrayHandlingYirmidokuz {

  public static void main(String[] args) {
    int[] sayilar = { 100, 200, 34, 44, 54, 64, 74, 84, 95 };
    try {
      int toplam = sayilar[1] + sayilar[10];// ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 9
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("error message");
    }
    System.out.println("program devam");
  }

}
