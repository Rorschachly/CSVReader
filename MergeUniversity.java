import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MergeUniversity {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner schoolInfo = new Scanner(new File("/Users/Jialiang/Desktop/schoolInfo.csv"));
      Scanner cwur = new Scanner(new File("/Users/Jialiang/Desktop/cwurData.csv"));
      schoolInfo.useDelimiter(",");
      while (schoolInfo.hasNextLine()) {
         System.out.println(schoolInfo.nextLine() + " | ");
      }
      schoolInfo.close();
   }
}