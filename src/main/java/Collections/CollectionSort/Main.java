package Collections.CollectionSort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Main {

    public static void main(String[] args) {
        // Sort Array
        sortArray();

        // Sort with Comporator
        sortWithCamporator();
        
        // Reverse order sorted by comporator
        reverseSortWithCamporator();

        // Sort with Comparable Interface
        sortWithComparable();
        
        //Sorting by put all Comporator in one class
        sortWithManyCamporators();
        
        //Sorting with lambda
        sortWithLambda();
    }
    
    public static void sortArray() {
        String[] items = {"apples", "lemons", "geese", "bacon", "youtube"};
        List<String> listItems = Arrays.asList(items);
        Collections.sort(listItems);
        System.out.println( listItems);
        Collections.sort(listItems, Collections.reverseOrder());
        System.out.printf("%s\n", listItems);
        listItems.sort((str1, str2) -> str1.compareTo(str2));
        System.out.printf("%s\n", listItems);
    }
    
    public static void sortWithCamporator() {
        List<User> users = new ArrayList<>();
        User user1 = new User(1, "John");
        User user2 = new User(2, "Wiliam");
        User user3 = new User(3, "Alex");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        System.out.println(users.contains(user1));
        System.out.println("Before sorting: \n" + users);
        Collections.sort(users, new UserNameComparator());
        System.out.println("After sorting by Name: \n" +users);
    }
    
    public static void reverseSortWithCamporator() {
        List<User> users = new ArrayList<>();
        User user1 = new User(1, "John");
        User user2 = new User(2, "Wiliam");
        User user3 = new User(3, "Alex");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        Collections.sort(users, Collections.reverseOrder(new UserNameComparator()));
        System.out.println("After reverse sorting by Name: \n" + users);
    }
    
    public static void sortWithComparable() {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(1, "John");
        Student student2 = new Student(2, "Wiliam");
        Student student3 = new Student(3, "Alex");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println("\nBefore sorting: \n" + students);
        Collections.sort(students);
        System.out.println("After sorting by Name: \n" + students);
    }
    
    public static void sortWithManyCamporators() {
        List<Mountain> mountains = new ArrayList<>();
        Mountain mountain1 = new Mountain("Mont Blanc", 4808);
        Mountain mountain2 = new Mountain("Everest", 8848);
        Mountain mountain3 = new Mountain("Galdhøpiggen", 2469);
        Mountain mountain4 = new Mountain("Elbrus", 5642);
        mountains.add(mountain1);
        mountains.add(mountain2);
        mountains.add(mountain3);
        mountains.add(mountain4);
        System.out.println("\nBefore sorting: \n" +mountains);
        SortMountains sortMauntains = new SortMountains();
        Collections.sort(mountains, sortMauntains.new NameCompare());
        System.out.println("After sorting by Name: \n" +mountains);
        Collections.sort(mountains, sortMauntains.new HeightCompare());
        System.out.println("After sorting by Height: \n" +mountains);
    }
    
    public static void sortWithLambda() {
        List<Mountain> mountains = new ArrayList<>();
        Mountain mountain1 = new Mountain("Mont Blanc", 4808);
        Mountain mountain2 = new Mountain("Everest", 8848);
        Mountain mountain3 = new Mountain("Galdhøpiggen", 2469);
        Mountain mountain4 = new Mountain("Elbrus", 5642);
        mountains.add(mountain1);
        mountains.add(mountain2);
        mountains.add(mountain3);
        mountains.add(mountain4);
        System.out.println("\nBefore sorting: \n" +mountains);
        Collections.sort(mountains, Comparator.comparing(Mountain::getName));
        System.out.println("After sorting by Name: \n" +mountains);
        mountains.sort((Mountain one, Mountain two) -> one.getHeight().compareTo(two.getHeight()));
        System.out.println("After sorting by Height: \n" +mountains);
    }
    
}
