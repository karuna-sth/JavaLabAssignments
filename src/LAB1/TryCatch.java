package LAB1;
public class TryCatch {
  public static void main(String[] args) {
    try {
      int num = 0/0;
      System.out.println(num);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}