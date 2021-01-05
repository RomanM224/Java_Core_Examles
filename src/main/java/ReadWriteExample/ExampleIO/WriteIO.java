package ReadWriteExample.ExampleIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URISyntaxException;
import java.net.URL;

public class WriteIO {

    public static void main(String[] args) {
        WriteIO write = new WriteIO();

        writeInFile();

        // writeInFile2();

        // write.writeInFile3();

        writeOutputStream();
    }

    public static void writeInFile() {
        try (Writer writer = new FileWriter("src/main/resources/textWriteIO.txt", true)) { // If "true", write to the
                                                                                           // end of the file
            writer.write("str1\n");
            writer.write("str2\n");
            // writer.flush(); //method flush() need to write strings to file
            // but flush() runs automatecly when method close() performed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeInFile2() {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(new File("src/main/resources/textWriteIO.txt"), true))) {
            writer.write("str3\n");
            writer.write("str4\n");
            // writer.flush(); //method flush() need to write strings to file
            // but flush() runs automatecly when method close() performed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeInFile3() { // not working url
        URL url = getClass().getClassLoader().getResource("textWriteIO.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(url.toURI()), true))) {
            writer.write("str5");
            writer.write("str6");
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static void writeOutputStream() {
        try (OutputStream outputStream = new FileOutputStream("src/main/resources/textWriteIO.txt")) {
            byte[] bytes = { 66, 10, 77 };
            outputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
