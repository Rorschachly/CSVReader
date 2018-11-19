import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MergeUniversity {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner schoolInfo = new Scanner(new File("/Users/Jialiang/Desktop/CSVReader/schoolInfo.csv"));
      
      schoolInfo.useDelimiter(",");
      int count = 0;
      while (schoolInfo.hasNextLine()) {
         String currentLine = schoolInfo.nextLine();
         currentLine = currentLine.substring(0, currentLine.indexOf(','));
         currentLine = stringHandle(currentLine);
         Scanner cwur = new Scanner(new File("/Users/Jialiang/Desktop/CSVReader/cwurData2.csv"));
         cwur.useDelimiter(",");
         while (cwur.hasNextLine()) {
            String cLine = cwur.nextLine();
            cLine = cLine.substring(0, cLine.indexOf(','));
            cLine = stringHandle(cLine);
            if (cLine.equals(currentLine)) {
               count++;
               System.out.println(cLine);
            }
         }
      }
      System.out.println(count);
      schoolInfo.close();
   }

   public static String stringHandle(String str) {
      String output = str.replaceAll("[-,]", " ").trim().replaceAll(" +", " ");;
      return output; 
   }
}