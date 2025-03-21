public class Test{
  public static void main(String[] args) {
    digitToBinary();
    BinaryToDigit();
  }
  private static void digitToBinary(){
    int number = 45;
    String s = "";
    while (number > 0) {
      int x = number % 2;
      s = x+s;
      number = number/2;
    }
    System.out.println(s);
  }
  private static void BinaryToDigit(){
    String binary = "101101";
    int powerOfTwo = 1 , result = 0;
    for (int i = 0; i < binary.length(); i++) {
      if (binary.charAt(i) == '1') {
        result = result + powerOfTwo;
      }
      powerOfTwo = 2*powerOfTwo;
    }
    System.out.println(result);
  }
}