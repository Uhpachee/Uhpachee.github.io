import java.util.*;
public class HiddenWord {
  static String input;
  
  public HiddenWord(String a) {
    input = a;
  }

  public String getHint(String input) {
    char[] word = new char[input.length()];
    for(int i = 0; i < input.length(); i++) {
      word[i] = input.charAt(i);
    }
    char[] out = new char[input.length()];
    char[] right = {H,A,R,"P","S"};
    for(int i = 0; i < word.length; i++) {
      char temp = word[i];
      for(int j = 0; j < right.length; i++) {
        char check = right[j];
        if(i == j && temp.equals(check)) {
          out[i] = right[i];
        } else if(temp.equals(check)) {
          out[i] = "+";
        } else
          out[i] = "*";
      }
    }
    String output = "";
    for (char a : out) {
      out += a;
    }
    return output;
  }
}

public static void main(String[] args) {
  HiddenWord a = new HiddenWord();
  a.getHint("FINDS");
  a.getHint("PLIED");
  a.getHint("HARPS");
}