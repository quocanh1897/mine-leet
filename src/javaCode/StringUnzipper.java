package javaCode;

public class StringUnzipper {

  public String unzip(String str) {
    int[] index = new int[]{0};
    return unzip(str, index);
  }

  private String unzip(String str, int[] index) {
    StringBuilder result = new StringBuilder();
    StringBuilder num = new StringBuilder();

    while (index[0] < str.length()) {
      char c = str.charAt(index[0]);

      if (Character.isLetter(c)) {
        result.append(c);
        index[0]++;
      } else if (c == '(') {
        index[0]++;
        String subPattern = unzip(str, index);
        // Append the repeated pattern to result
        for (int i = 0; i < Integer.parseInt(num.toString()); i++) {
          result.append(subPattern);
        }
        num = new StringBuilder(); // Reset the number buffer
      } else if (c == ')') {
        index[0]++;
        return result.toString();
      } else {
        // Parse the number and keep it in buffer
        while (index[0] < str.length() && Character.isDigit(str.charAt(index[0]))) {
          num.append(str.charAt(index[0]));
          index[0]++;
        }
      }
    }

    return result.toString();
  }

  public static void main(String[] args) {
    StringUnzipper unzipper = new StringUnzipper();

    System.out.println(unzipper.unzip("((ab)2b3)2")); // Expected: "ababbbbababbbb"
    System.out.println(unzipper.unzip("(hahb)2a3"));  // Expected: "hahbhahbaaa"
    System.out.println(unzipper.unzip("a(b2c3)4"));   // Expected: "abbcbbccbbccbbccbbcca"
    System.out.println(unzipper.unzip("(x)3"));       // Expected: "xxx"
    System.out.println(unzipper.unzip("y"));          // Expected: "y"
  }
}
