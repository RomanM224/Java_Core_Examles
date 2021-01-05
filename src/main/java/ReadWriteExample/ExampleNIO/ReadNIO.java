package ReadWriteExample.ExampleNIO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ReadNIO {

    public static void main(String[] args) {
        ReadNIO read = new ReadNIO();

        // readByChar();

        // readByChar2();

        read.readByLine();
        
     //   readInputStream1();
        
      //  readInputStream2();
    }

    public static void readByChar() {
        try (Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/textReadNIO.txt"))) {
            char[] chars = new char[50];
            while (reader.read(chars) != -1) {
                System.out.println(chars);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readByChar2() {
        try (Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/textReadNIO.txt"))) {
            char[] chars = new char[50];
            reader.read(chars);
            for (int i = 0; i < chars.length; i++) {
                if (Character.isAlphabetic(chars[i]) || Character.isWhitespace(chars[i])) {
                    System.out.println(chars[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readByLine() { // BufferedReader 10 times faster than simply Reader
        URL url = getClass().getClassLoader().getResource("textReadNIO.txt");
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(url.toURI()))) {
            int letter;
            while ((letter = reader.read()) != -1) {
                System.out.println((char) letter + reader.readLine());
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static void readInputStream1() {
        try (InputStream inputStream = Files.newInputStream(Paths.get("src/main/resources/textReadNIO.txt"))) {
            int i = 0;
            while ((i = inputStream.read()) != -1) {
             //   System.out.println(i);
              System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readInputStream2() {
        try (BufferedInputStream inputStream = new BufferedInputStream(
                Files.newInputStream(Paths.get("src/main/resources/textReadNIO.txt")))) {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] == 0) {
                    break;
                }
                System.out.println((char) bytes[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
