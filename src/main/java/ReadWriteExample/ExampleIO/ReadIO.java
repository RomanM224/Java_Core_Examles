package ReadWriteExample.ExampleIO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadIO {
//java.lang.Object -> java.io.Reader -> java.io.InputStreamReader -> java.io.FileReader
//java.lang.Object -> java.io.InputStream -> java.io.FileInputStream
//java.lang.Object -> java.io.Reader -> java.io.BufferedReader
    
    public static void main(String[] args) {
        ReadIO read = new ReadIO();

        // readByChar();

        // readByChar2();

        // read.readByChar3();

        // read.readByLine();

        // read.readByLine2();

        //readByInputStream();
        
        read.readByInputStream2();
        
      readByInputStream3();
    }

    public static void readByChar() {
        try (Reader readed = new FileReader("src/main/resources/textReadIO.txt");) { 
            int i = 0;
            while ((i = readed.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readByChar2() {
        try (Reader reader = new FileReader("src/main/resources/textReadIO.txt")) {
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

    // BufferedReader allows read by line "reader.readLine()"
    public void readByLine() { // BufferedReader 10 times faster than simply Reader
        URL url = getClass().getClassLoader().getResource("textReadIO.txt"); // Can not be used in staic method
       // try (BufferedReader reader = new BufferedReader(new FileReader(new File(url.toURI())))) {
        try (BufferedReader reader = new BufferedReader(new FileReader("textReadIO.txt"))) {


            int letter;
            while ((letter = reader.read()) != -1) {
                System.out.println((char) letter + reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readByLine2() { // BufferedReader 10 times faster than simply Reader
        URL url = getClass().getClassLoader().getResource("textReadIO.txt"); // Can not be used in staic method
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
       //try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {

            int letter;
            while ((letter = reader.read()) != -1) {
                System.out.println((char) letter + reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readByInputStream() {
        try (InputStream inputStream = new FileInputStream("src/main/resources/textReadIO.txt")) {
            int i = 0;
            while ((i = inputStream.read()) != -1) {
 //               System.out.println(Character.toChars(i));
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readByInputStream2() {
        URL url = getClass().getClassLoader().getResource("textReadIO.txt"); // Can not be used in staic method
        try (InputStream inputStream = new FileInputStream(new File(url.toURI()))) {
            int i = 0;
            while ((i = inputStream.read()) != -1) {
 //               System.out.println(Character.toChars(i));
                System.out.println((char) i);
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
    
    public static void readByInputStream3() {
        try (BufferedInputStream inputStream = new BufferedInputStream(
                new FileInputStream("src/main/resources/textReadIO.txt"))) {
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
