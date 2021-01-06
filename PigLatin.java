public class PigLatin {
  public static String pigLatinSimple(String s){
    if ("AEIOUaeiou".indexOf(s.charAt(0)) != -1) {
      return (s.substring(0, s.length())+ "hay");
    }else if(s.length() >= 2){
      return (s.substring(1, s.length()) + s.substring(0, 1) + "ay");
    }else{
      return (s.substring(0, 1) + "ay");
    }
  }

  public static String pigLatin(String s){}

  public static String pigLatinBest(String s){}
}
