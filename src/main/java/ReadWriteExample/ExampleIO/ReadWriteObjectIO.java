package ReadWriteExample.ExampleIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import ReadWriteExample.Sword;
import ReadWriteExample.User;

public class ReadWriteObjectIO {
//java.lang.Object -> java.io.InputStream -> java.io.FileInputStream
//java.lang.Object -> java.io.InputStream -> java.io.ObjectInputStream

//java.lang.Object -> java.io.OutputStream -> java.io.FileOutputStream
//java.lang.Object -> java.io.OutputStream -> java.io.ObjectOutputStream
    
    public static void main(String[] args) {
        ReadWriteObjectIO readWrite = new ReadWriteObjectIO();

        List<User> users = new ArrayList<>();
        User user1 = new User("Roman", 5);
        Sword sword = new Sword("Stunning");
        user1.sword = sword;
        User user2 = new User("Vika", 9);
        User user3 = new User("Anja", 8);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        
        readWrite.writeObject(user1);
        
        System.out.println(readWrite.readObject());
        
       readWrite.writeListObject(users);
        
        System.out.println(readWrite.readListObject());

    }

    public void writeObject(User user) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/singleObject.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public User readObject() {
        User user = null;
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/singleObject.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            user = (User) objectInputStream.readObject();
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void writeListObject(List<User> users) {
        try (FileOutputStream fileInputStream = new FileOutputStream("src/main/resources/listObjects.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileInputStream);) {
            objectOutputStream.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<User> readListObject() {
        List<User> users = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/listObjects.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            users = (ArrayList) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }

}
