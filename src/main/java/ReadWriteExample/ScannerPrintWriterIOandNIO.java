package ReadWriteExample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ScannerPrintWriterIOandNIO {
//java.lang.Object -> java.util.Scanner  
//java.lang.Object -> java.io.Writer -> java.io.PrintWriter
    public static void main(String[] args) {
//       readByScannerIO();

//        readByScannerNIO();

//        writeByPrintWriterIO();
//        
//        writeByPrintWriterNIO();
//        
//        writeByPrintWriterNIO2();
    }

    public static void readByScannerIO() {
        try {
            Scanner scan = new Scanner(new FileReader("src/main/resources/ScannerPrintWriter.txt"));
            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readByScannerNIO() {
        try {
            Scanner scan = new Scanner(Files.newBufferedReader(Paths.get("src/main/resources/ScannerPrintWriter.txt")));
            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeByPrintWriterIO() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("src/main/resources/ScannerPrintWriter.txt"), true)) {
            writer.println("Hello12");
            writer.println("Write from new line");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeByPrintWriterNIO() {
        try (PrintWriter writer = new PrintWriter(
                Files.newBufferedWriter(Paths.get("src/main/resources/ScannerPrintWriter.txt")))) {
            writer.println("Hello12");
            writer.println("Write from new line");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeByPrintWriterNIO2() {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(
                Paths.get("src/main/resources/ScannerPrintWriter.txt"), StandardOpenOption.APPEND))) {
            writer.println("Hello12");
            writer.println("Write from new line");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
