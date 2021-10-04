import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    File file = new File(); //insert file path here
    Scanner scan = new Scanner(file);
    scan.useDelimiter("\\Z");
    while (scan.hasNextLine()) {
      if (scan.findInLine("//") != null);
      else{
        System.out.println(scan.nextLine());
      }
      
    }
    scan.close();
  }
}
