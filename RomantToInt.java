public class RomantToInt {
  public static int getValue(char c) {
    switch (c) {
      case 'I': return 1;
      case 'V': return 5;
      case 'X': return 10;
      case 'L': return 50;
      case 'C': return 100;
      case 'D': return 500;
      case 'M': return 1000;
      default: return 0;
    }
  }

  public static int romanToInt(String s) {
    int result = 0;
    int prevValue = 0; 
    for(int i = 0; i < s.length(); i++) {      // MCMXCIV
      int currentValue = getValue(s.charAt(i)); // M = 1000 | C = 100 | M = 1000 | X = 10 | C = 100 | I = 1 | V = 5
      if (currentValue > prevValue) { // 1000 > 0 | 100 > 1000 | 100 > 100 | 10 > 1000 | 100 > 10|  1 > 100 | 5 > 1
        result = result + currentValue - (2 * prevValue); // 0 + 1000 - (2 * 0) = 1000 | 1100 + 1000 - (2 * 100) = 1900| 1910 + 100 - (2 * 10) = 1990| 1991 +5 - (2 * 1) = 1994
      } else { 
        result += currentValue;
      }
      prevValue = currentValue; // prevValue = 5 
    }
    return result; // result =1994
  }

  public static void main(String[] args) {
    String s = "MCMXCIV";
    int result = romanToInt(s);
    System.out.println(result);
  }
}
