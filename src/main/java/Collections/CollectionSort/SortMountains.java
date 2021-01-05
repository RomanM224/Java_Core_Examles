package Collections.CollectionSort;
import java.util.Comparator;

public class SortMountains {
    
    class NameCompare implements Comparator<Mountain> {
        
        public int compare(Mountain one, Mountain two) {
            return one.getName().compareTo(two.getName());
        }
    }

    class HeightCompare implements Comparator<Mountain> {
        
        public int compare(Mountain one, Mountain two) {
            return one.getHeight().compareTo(two.getHeight());
        }
    }

}
