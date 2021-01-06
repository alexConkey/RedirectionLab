import java.util.ArrayList;

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
    ArrayList<String> diaphrams = Arrays.asList({"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"});
    if ("AEIOUaeiou".indexOf(s.charAt(0)) != -1) {
      return (s.substring(0, s.length())+ "hay").toLowerCase();
    }else if (s.length() >= 3 && (diaphrams.indexOf(s.substring(0,2)) != -1)){
      return (s.substring(2, s.length()) + s.substring(0, 2) + "ay").toLowerCase();
    }else if (s.length() >= 2 && (diaphrams.indexOf(s.substring(0,2)) != -1)){
      return (s.substring(0, 2) + "ay").toLowerCase();
    }else if(s.length() >= 2){
      return (s.substring(1, s.length()) + s.substring(0, 1) + "ay").toLowerCase();
    }else{
      return (s.substring(0, 1) + "ay").toLowerCase();
    }
  }

  public static String pigLatinBest(String s){}
}
