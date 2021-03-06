import java.util.*;

public class PigLatin {
  public static String pigLatinSimple(String s){
    if ("AEIOUaeiou".indexOf(s.charAt(0)) != -1) {
      return (s.substring(0, s.length())+ "hay").toLowerCase();
    }else if(s.length() >= 2){
      return (s.substring(1, s.length()) + s.substring(0, 1) + "ay").toLowerCase();
    }else{
      return (s.substring(0, 1) + "ay").toLowerCase();
    }
  }

  public static String pigLatin(String s){
    String[] array = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    List<String> diaphrams = Arrays.asList(array);
    if ("AEIOUaeiou".indexOf(s.charAt(0)) != -1) {
      return (s.substring(0, s.length())+ "hay").toLowerCase();
    }else if (s.length() >= 3 && (diaphrams.indexOf(s.substring(0,2).toLowerCase()) != -1)){
      return (s.substring(2, s.length()) + s.substring(0, 2) + "ay").toLowerCase();
    }else if (s.length() >= 2 && (diaphrams.indexOf(s.substring(0,2).toLowerCase()) != -1)){
      return (s.substring(0, 2) + "ay").toLowerCase();
    }else if(s.length() >= 2){
      return (s.substring(1, s.length()) + s.substring(0, 1) + "ay").toLowerCase();
    }else{
      return (s.substring(0, 1) + "ay").toLowerCase();
    }
  }

  public static String pigLatinBest(String s){
    String[] array = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    List<String> diaphrams = Arrays.asList(array);
    String punctuation = "";
    String newS = "";
    String pending = "";
    for (int i = 0; i < s.length(); i++){
      if ("abcdefghijklmnopqrstuvwxyz1234567890".indexOf(s.toLowerCase().charAt(i)) != -1){
        newS += pending + s.charAt(i);
        pending = "";
      }else{
        pending += s.charAt(i);
      }
    }
    punctuation = pending;
    s = newS;
    if ("abcdefghijklmnopqrstuvwxyz".indexOf(s.toLowerCase().charAt(0)) == -1){
      return s;
    }else if ("AEIOUaeiou".indexOf(s.charAt(0)) != -1) {
      return (s.substring(0, s.length())+ "hay").toLowerCase() + punctuation;
    }else if (s.length() >= 3 && (diaphrams.indexOf(s.substring(0,2).toLowerCase()) != -1)){
      return (s.substring(2, s.length()) + s.substring(0, 2) + "ay").toLowerCase() + punctuation;
    }else if (s.length() >= 2 && (diaphrams.indexOf(s.substring(0,2).toLowerCase()) != -1)){
      return (s.substring(0, 2) + "ay").toLowerCase() + punctuation;
    }else if(s.length() >= 2){
      return (s.substring(1, s.length()) + s.substring(0, 1) + "ay").toLowerCase() + punctuation;
    }else{
      return (s.substring(0, 1) + "ay").toLowerCase() + punctuation;
    }
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while (scan.hasNextLine()){
      boolean space = false;
      String currentLine = scan.nextLine();
      String convertedLine = "";
      String currentWord = "";
      for(int i = 0; i < currentLine.length(); i++){
        if (currentLine.charAt(i) == ' '){
          convertedLine += pigLatinBest(currentWord) + " ";
          currentWord = "";
        }else{
          currentWord += currentLine.charAt(i);
        }
      }
      convertedLine += pigLatinBest(currentWord);
      System.out.println(convertedLine);
    }
  }
}
