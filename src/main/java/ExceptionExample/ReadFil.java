package ExceptionExample;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFil {

    public void read() {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
        File f = new File("src/main/resources/text.txt");
        try (FileReader fr = new FileReader(f)) {
            char[] array = new char[10];
            fr.read(array);
            for (char c : array)
                System.out.print(c);
        } catch (IOException e1) {
            System.out.println(e1.toString());
            System.out.println(e1.getCause());
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        }

    }
}
