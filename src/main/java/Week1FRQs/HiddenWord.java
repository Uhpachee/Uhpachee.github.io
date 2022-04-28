package Week1FRQs;

import java.util.*;
public class HiddenWord {
  static String input;

  public HiddenWord(String a) {
    input = a;
  }

  public String getHint(String input) {
    char[] word = new char[input.length()];
    for (int i = 0; i < input.length(); i++) {
      word[i] = input.charAt(i);
    }
    Object[] out = new Object[input.length()];
    char[] right = {'H', 'A', 'R', 'P', 'S'};
    for (int i = 0; i < word.length; i++) {
      char temp = word[i];
      for (int j = 0; j < right.length; j++) {
        char check = right[j];
        if (i == j && temp == check) {
          out[i] = right[i];
          break;
        } else if (temp == check) {
          out[i] = "+";
          break;
        } else {
          out[i] = "*";
        }
      }
    }
    String output = "";
    for (Object a : out) {
      output += a;
    }
    return output;
  }

  public static void main(String[] args) {
    HiddenWord a = new HiddenWord("YOMOM");
    System.out.println(a.getHint("FINDS"));
    System.out.println(a.getHint("PLIED"));
    System.out.println(a.getHint("HARPS"));
  }
}