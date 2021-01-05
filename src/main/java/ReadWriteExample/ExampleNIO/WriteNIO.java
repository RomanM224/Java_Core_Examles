package ReadWriteExample.ExampleNIO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteNIO {

    public static void main(String[] args) {
        WriteNIO write = new WriteNIO();
    //    writeInFile();
        
    //    writeInFile2();
        
   //     writeInFile3();
        
        writeOutputStream();
    }
    
    public static void writeInFile() {
        try (Writer writer = Files.newBufferedWriter(Paths.get("src/main/resources/textWriteNIO.txt"))) {
            writer.write("str1\n");
            writer.write("str2\n");
            // writer.flush(); //method flush() need to write strings to file
            // but flush() runs automatecly when method close() performed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void writeInFile2() {
        try(BufferedWriter writer = Files.newBufferedWriter(Paths.get("src/main/resources/textWriteNIO.txt"))){
            writer.write("str3\n");
            writer.write("str4\n");
            // writer.flush(); //method flush() need to write strings to file
            // but flush() runs automatecly when method close() performed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeInFile3() {
        try (BufferedWriter writer = new BufferedWriter(
                Files.newBufferedWriter(Paths.get("src/main/resources/textWriteNIO.txt"), StandardOpenOption.APPEND))) {
            writer.write("str4");
            writer.newLine();
            writer.write("str5");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void writeOutputStream() {
          try (OutputStream outputStream = Files.newOutputStream(Paths.get("src/main/resources/textWriteNIO.txt"))) {
          byte[] bytes = { 77, 10, 75 };
          outputStream.write(bytes);
      } catch (IOException e) {
          e.printStackTrace();
      }
  }

}
