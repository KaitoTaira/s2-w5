import java.util.*;
class Main {
  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<String>(){
      {
        add("vivacious");
        add("weigh");
        add("planes");
        add("art");
        add("sugar");
        add("waggish");
        add("instinctive");
        add("shrug");
        add("clip");
        add("lovely");
        add("mind");
        add("offbeat");
      }
    };
    //we will play with compareTo here
    char c = 'a';
    int ascii = (int)c;
    System.out.println(ascii);
    String s = "d";
    String s1 = "D";
    int result = s.compareTo(s1);
    System.out.println(result);
    Collections.sort(words);
    System.out.println(words);
  }
}