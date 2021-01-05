package LamdaExpressionStreamAPI.StreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDistinctAllMatchAnyMatch {

    public static void main(String[] args) {
        testDistinct();
        testMatch();
    }

    // Метод distinct возвращает stream без дубликатов, при этом для упорядоченного
    // стрима (например, коллекция на основе list) порядок стабилен , для
    // неупорядоченного - порядок не гарантируется
    // Метод collect преобразует stream в коллекцию или другую структуру данных
    private static void testDistinct() {
        System.out.println();
        System.out.println("Test distinct start");
        Collection<String> ordered = Arrays.asList("a1", "a2", "a2", "a3", "a1", "a2", "a2");
        Collection<String> nonOrdered = new HashSet<>(ordered);

        // Получение коллекции без дубликатов
        List<String> distinct = nonOrdered.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct = " + distinct); // напечатает distinct = [a1, a2, a3] - порядок не гарантируется

        List<String> distinctOrdered = ordered.stream().distinct().collect(Collectors.toList());
        System.out.println("distinctOrdered = " + distinctOrdered); // напечатает distinct = [a1, a2, a3] - порядок
                                                                    // гарантируется
    }

    // Метод anyMatch - возвращает true, если условие выполняется хотя бы для одного
    // элемента
    // Метод noneMatch - возвращает true, если условие не выполняется ни для одного
    // элемента
    // Метод allMatch - возвращает true, если условие выполняется для всех элементов
    private static void testMatch() {
        System.out.println();
        System.out.println("Test anyMatch, allMatch, noneMatch  start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        // найти существуют ли хоть одно совпадение с шаблоном в коллекции
        boolean isAnyOneTrue = collection.stream().anyMatch("a1"::equals);
        System.out.println("anyOneTrue " + isAnyOneTrue); // напечатает true
        boolean isAnyOneFalse = collection.stream().anyMatch("a8"::equals);
        System.out.println("anyOneFlase " + isAnyOneFalse); // напечатает false

        // найти существуют ли все совпадения с шаблоном в коллекции
        boolean isAll = collection.stream().allMatch((s) -> s.contains("1"));
        System.out.println("isAll " + isAll); // напечатает false

        // сравнение на неравенство
        boolean isNotEquals = collection.stream().noneMatch("a7"::equals);
        System.out.println("isNotEquals " + isNotEquals); // напечатает true
    }

}
