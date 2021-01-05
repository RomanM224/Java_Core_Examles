package ReadWriteExample.ExampleNIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class PathFilesWorking {

    public void method1() {
        Path path = Paths.get("src/main/resources/textWrite.txt").toAbsolutePath();

        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());

        try {
            Files.copy(Paths.get("src/main/resources/text.txt"), Paths.get("src/main/resources/text2.txt"),
                    StandardCopyOption.REPLACE_EXISTING);
         //   Files.move(Paths.get("src/main/resources/file1.txt"), Paths.get("src/main/resources/file2.txt"),
           //         StandardCopyOption.REPLACE_EXISTING);
//            Files.deleteIfExists(Paths.get("src/main/resources/text3.txt"));
//            System.out.println(Files.size(Paths.get("src/main/resources/text.txt")));
//
//            Files.createDirectories(Paths.get("newdir/dir/text.txt")); // Create dir
//            System.out.println(Files.size(path));
//            System.out.println(Files.isDirectory(path));
//            System.out.println(Files.isHidden(path));
//            System.out.println(Files.isExecutable(path));
//            System.out.println(Files.isReadable(path));
//            System.out.println(Files.isWritable(path));
//
//            System.out.println("File size " + Files.getAttribute(path, "size", LinkOption.NOFOLLOW_LINKS));
//            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class,
//                    LinkOption.NOFOLLOW_LINKS); // Get attributes

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void method2() {
        Path path = Paths.get("src/main/resources/textWrite.txt");
        byte[] bytes;
        try {
            bytes = Files.readAllBytes(path);
            for (int i = 0; i < bytes.length; i++) {
                System.out.println( bytes[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void methorWrites() {
        try {
            Files.write(Paths.get("src/main/resources/textWrite.txt"), "Romana".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void readWriteInList() {
        try {

            List<String> list = Files.readAllLines(Paths.get("src/main/resources/newText.txt"));
            for(String str : list) {
                System.out.println(str);
            }
            Files.write(Paths.get("src/main/resources/text1.txt"), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void readDirectory() {
        Path path = Paths.get("src/main/resources/textWrite.txt");
        try(DirectoryStream<Path> entries = Files.newDirectoryStream(Paths.get("."))){
            for(Path path1 : entries) {
                System.out.println(path1.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    //Others ways how we can use Files
    //InputStream inputStream = Files.newInputStream(Paths.get("src/main/resources/textWrite.txt"));
    //OutputStream outputStream = Files.newOutputStream(Paths.get("src/main/resources/textWrite.txt"));
    //Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/textWrite.txt"))
    //Writer writer = Files.newBufferedWriter(Paths.get("src/main/resources/textWrite.txt"))
    
}
