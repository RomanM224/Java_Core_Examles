package MapExample;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(1, "Roma");
        Human human2 = new Human(2, "Vika");
        Human human3 = new Human(3, "Alex");
        Human human4 = new Human(4, "Kate");
        
        Map<Human, String> hashMap = new HashMap<>();
        hashMap.put(human1, "str1");
        hashMap.put(human2, "str2");
        hashMap.put(human3, "str3");
        hashMap.put(human4, "str4");
        
        for(Map.Entry<Human, String> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }
        
        System.out.println(hashMap.get(human2));
        
        //After change fields chaches hashCode and we can't find our object
        human2.id = 5;
        human2.name = "asd";
        System.out.println(hashMap.get(human2));
        
        for(Map.Entry<Human, String> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }
    }

}
