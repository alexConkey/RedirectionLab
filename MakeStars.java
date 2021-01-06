import java.util.*;

public class MakeStars {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while (scan.hasNextLine()){
      boolean space = false;
      String currentLine = scan.nextLine();
      String convertedLine = "";
      for(int i = 0; i < currentLine.length(); i++){
        if (currentLine.charAt(i) != ' '){
          convertedLine += "*";
        }else{
          convertedLine += " ";
        }
      }
      System.out.println(convertedLine);
    }
  }
}
