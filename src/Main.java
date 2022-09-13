import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     try(FileWriter fileWriter=new FileWriter("Text.txt")){
         fileWriter.write("A a ");
         fileWriter.write("\nB b ");
         fileWriter.write("\nC c ");
         fileWriter.write("\nD d ");
         fileWriter.write("\nE e ");
         fileWriter.write("\nF f ");
         fileWriter.write("\nJ j ");
         fileWriter.write("\nH h ");
         fileWriter.write("\nI i ");
         fileWriter.write("\n1");
         fileWriter.write("\n2");
         fileWriter.write("\n3");
         fileWriter.write("\n4");
         fileWriter.write("\n5");
         fileWriter.write("\n6");
         fileWriter.write("\n7");
     }catch (IOException e){
throw new RuntimeException();
     }


     try(FileReader fileReader=new FileReader("Text.txt")){
         Scanner scanner=new Scanner(fileReader);
         while (scanner.hasNextLine()){
             System.out.println(scanner.nextLine());

         }
     }catch (IOException e){
         throw new RuntimeException();
     }
    }
}