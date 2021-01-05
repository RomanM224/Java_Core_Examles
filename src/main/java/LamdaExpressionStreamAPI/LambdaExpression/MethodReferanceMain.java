package LamdaExpressionStreamAPI.LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class MethodReferanceMain {

    public static void main(String[] args) {
        List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
        System.out.println(messages);
        // messages = messages.stream().map(word ->
        // word.toUpperCase()).collect(Collectors.toList());
        messages = messages.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(messages);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers);
        numbers = numbers.stream().map(MethodReferanceMain::pow).collect(Collectors.toList());
        System.out.println(numbers);

        List<MethodReferanceBicycle> bicycles = Arrays.asList(new MethodReferanceBicycle("qwe", 123),
                new MethodReferanceBicycle("asd", 500), new MethodReferanceBicycle("zxc", 1233),
                new MethodReferanceBicycle("qwe", 90));
        MethodReferanceBicycleComporator bikeFrameSizeComparator = new MethodReferanceBicycleComporator();
        System.out.println(bicycles);
        //bicycles = bicycles.stream().sorted((a, b) -> bikeFrameSizeComparator.compare(a, b)).collect(Collectors.toList());
        bicycles = bicycles.stream().sorted(bikeFrameSizeComparator::compare).collect(Collectors.toList());
        System.out.println(bicycles);
    }

    public static int pow(int i) {
        return i * i;
    }

}
